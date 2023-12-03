package com.client.buys.infrastructure;

import com.client.dto.BuysDto;

import com.client.dto.ResponService;

public interface IBuysService {

	public ResponService createBuys(BuysDto buysDto) throws Exception;
	
}
