package com.client.dto;

import org.springframework.stereotype.Component;

import com.client.entity.Client;
import com.client.entity.Product;

@Component
public class BuysDto {

	private Product product;
	private Client client;

	public BuysDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuysDto(Product product, Client client) {
		super();
		this.product = product;
		this.client = client;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
