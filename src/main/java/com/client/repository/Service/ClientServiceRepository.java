package com.client.repository.Service;


import com.client.entity.Client;

public interface ClientServiceRepository {

	public Client save(Client user);
	public Client searchByDocument(String document);
	public Client deleteClient(Client client);
}
