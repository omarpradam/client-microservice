package com.client.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.client.dto.ResponService;
import com.client.entity.Client;
import com.client.repository.Service.impl.ClientServicesRepositoryImpl;
import com.client.dto.ClientDto;
import com.client.user.infrastructure.IClientService;

@RestController
@RequestMapping("/Client")
public class ClientController {

	private ResponService responService = null;

	@Autowired
	private IClientService iuserService;

	@Autowired
	private ClientServicesRepositoryImpl clientServicesRepositoryImpl;

	// create Client
	@PostMapping(value = "/createClient", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponService create(@RequestBody ClientDto userDto) {
		try {
			return iuserService.createUser(userDto);
		} catch (Exception e) {
			e.getMessage();
			return responService = new ResponService("Error", "404", false);
		}

	}

	// Uddate User
	@PutMapping(value = "/updateClient", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponService updateClient(@RequestBody ClientDto clientDto) {
		try {
			return iuserService.updateUser(clientDto);
		} catch (Exception e) {
			e.getMessage();
			return responService = new ResponService("Error", "404", false);
		}

	}

	// serach Document

	@GetMapping(value = "/searchByDocument/{document}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponService searchByDocument(@PathVariable String document) {

		try {

			Client clientTem = clientServicesRepositoryImpl.searchByDocument(document);
			return responService = new ResponService("Exitoso", "200", clientTem);

		} catch (Exception e) {
			e.getMessage();
			return responService = new ResponService("Error", "404", false);
		}

	}

	// Delete Client
	@DeleteMapping(value = "/deleteClient", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponService deleteClient(@RequestBody ClientDto clientDto) {
		try {
			return iuserService.deleteClient(clientDto);
		} catch (Exception e) {

			return responService = new ResponService(e.getMessage(), "404", false);
		}

	}

}
