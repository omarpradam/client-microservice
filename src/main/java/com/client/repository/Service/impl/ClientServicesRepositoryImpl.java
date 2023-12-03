package com.client.repository.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.client.entity.Client;
import com.client.repository.ClientRepositoty;
import com.client.repository.Service.ClientServiceRepository;

@Service("UserServicesRepositoryImpl")
public class ClientServicesRepositoryImpl implements ClientServiceRepository {

	@Autowired
	@Qualifier("userRepository")
	private ClientRepositoty userRepositoty;

	@Override
	public Client save(Client user) {
         
		return userRepositoty.save(user);
	}



	@Override
	public Client searchByDocument(String document) {
		
		return userRepositoty.findByDocument(document);
	}



	@Override
	public Client deleteClient(Client client) {
		// TODO Auto-generated method stub
		userRepositoty.delete(client);
		return null;
	}

}
