package com.client.buys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.client.buys.infrastructure.IBuysService;
import com.client.dto.BuysDto;

import com.client.dto.ResponService;

@RestController
@RequestMapping("/Buys")
public class BuysController {
	
	@Autowired
	private IBuysService iBuysService;
	
	private ResponService responService = null;
	// create Client
	@PostMapping(value = "/createBuys", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponService createBuys(@RequestBody BuysDto buysDto) {
		try {
			return iBuysService.createBuys(buysDto);
		} catch (Exception e) {
			e.getMessage();
			return responService = new ResponService("Error", "404", false);
		}

	}

}
