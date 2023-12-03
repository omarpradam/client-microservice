package com.client.dto;

import org.springframework.stereotype.Component;

import com.client.entity.Client;

@Component
public class ClientDto {

	private Client client;

	public ClientDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
}
