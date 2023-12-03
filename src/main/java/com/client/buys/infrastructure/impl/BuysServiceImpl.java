package com.client.buys.infrastructure.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.buys.infrastructure.IBuysService;
import com.client.dto.BuysDto;
import com.client.dto.ResponService;
import com.client.entity.Client;
import com.client.entity.Product;
import com.client.product.infrastructure.impl.ProductServiceImpl;
import com.client.repository.Service.ClientServiceRepository;
import com.client.repository.Service.impl.ProductServiceRepositoryImpl;

@Service("BuysServiceImpl")
public class BuysServiceImpl implements IBuysService {

	@Autowired
	private ClientServiceRepository clientServiceRepository;
	@Autowired
	private ProductServiceRepositoryImpl productServiceImpl;

	@Override
	public ResponService createBuys(BuysDto buysDto) throws Exception {

		Client clientTem = buysDto.getClient();
		Product productTem = buysDto.getProduct();

		Client client = clientServiceRepository.searchByDocument(clientTem.getDocument());

		if (client.getDocument() != null) {

			Client saveClient = clientServiceRepository.save(clientTem);
			Integer seriealTem = Integer.valueOf(saveClient.getSerial().toString());

			productTem.setClientSerial(seriealTem);

			Product saveProduct = productServiceImpl.save(productTem);

			BuysDto buysTem = new BuysDto();

			buysDto.setClient(saveClient);
			buysDto.setProduct(saveProduct);

			return new ResponService("successful buys create", "200", buysDto);

		} else {

			Integer seriealTem = Integer.valueOf(client.getSerial().toString());
			productTem.setClientSerial(seriealTem);
			
			Product saveProduct = productServiceImpl.save(productTem);

			BuysDto buysTem = new BuysDto();

			return new ResponService("successful buys create", "200", buysDto);
		}

		
	}

}
