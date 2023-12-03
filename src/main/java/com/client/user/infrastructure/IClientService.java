package com.client.user.infrastructure;

import com.client.dto.ClientDto;
import com.client.dto.ResponService;


public interface IClientService {

	public ResponService createUser(ClientDto clientDto) throws Exception;
	
	public ResponService updateUser(ClientDto clientDto) throws Exception;
	
	public ResponService deleteClient (ClientDto clientDto)throws Exception;

}
