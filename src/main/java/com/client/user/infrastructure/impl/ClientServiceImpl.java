package com.client.user.infrastructure.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.dto.ResponService;

import com.client.dto.ClientDto;
import com.client.entity.Client;

import com.client.repository.Service.impl.ClientServicesRepositoryImpl;
import com.client.user.infrastructure.IClientService;

@Service("UserServiceImpl")
public class ClientServiceImpl implements IClientService {

	@Autowired
	private ClientServicesRepositoryImpl clienRepository;

	// create user
	@Override
	public ResponService createUser(ClientDto clientDto) throws Exception {

		Client user = clientDto.getClient();

		Date day = new Date();
		user.setDateCreate(day);
		user.setDateUpdate(day);
		
		clienRepository.save(user);

		return new ResponService("successful", "200", clientDto);
	}

	@Override
	public ResponService updateUser(ClientDto clientDto) throws Exception {

		Client userTem = clienRepository.searchByDocument(clientDto.getClient().getDocument());

		if (userTem != null) {
			Date day = new Date();
			userTem.setEmail(clientDto.getClient().getEmail());
			userTem.setLastName(clientDto.getClient().getLastName());
			userTem.setName(clientDto.getClient().getName());
			userTem.setDateUpdate(day);

			clienRepository.save(userTem);

			return new ResponService("successful client update", "200", userTem);
		}

		return new ResponService("Error the client entered does not exist", "203", null);
	}

	@Override
	public ResponService deleteClient(ClientDto clientDto) throws Exception {
		
		Client userTem = clienRepository.searchByDocument(clientDto.getClient().getDocument());
		if (userTem != null) {
			

			clienRepository.deleteClient(userTem);

			return new ResponService("Deleted customer success", "200", userTem);
		}
		
		return new ResponService("Client not found error", "203", false);
	}

}
