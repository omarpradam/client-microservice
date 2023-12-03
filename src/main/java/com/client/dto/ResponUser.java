package com.client.dto;

import org.springframework.stereotype.Component;

import com.client.entity.Client;


@Component
public class ResponUser {

	private Client user;

	public ResponUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client getUser() {
		return user;
	}

	public void setUser(Client user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ResponUser [user=" + user + "]";
	}

}
