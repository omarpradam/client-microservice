package com.client.product.infrastructure.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.dto.ProductDto;
import com.client.dto.ResponService;
import com.client.entity.Client;
import com.client.entity.Product;
import com.client.product.infrastructure.IProductService;
import com.client.repository.Service.impl.ProductServiceRepositoryImpl;

@Service("ProductServiceImpl")
public class ProductServiceImpl  implements IProductService{
	
	@Autowired
	private ProductServiceRepositoryImpl productRepository;

	@Override
	public ResponService createProduct(ProductDto productDto) throws Exception {
		
		Product producTem = productDto.getProduct();
		Date day = new Date();
		producTem.setDateCreate(day);
		producTem.setDateUpdate(day);
		productRepository.save(producTem);
		
		return new ResponService("successful", "200", productDto);
	}

	@Override
	public ResponService updateClient(ProductDto productDto) throws Exception {

		Integer idClient = productDto.getProduct().getClientSerial();
		String reference = productDto.getProduct().getReferenceNumber();
		
		Product productTem = productRepository.findByclientSerialAndIdProduct(idClient, reference);
		
		if(productTem != null) {
			Date day = new Date();
			productTem.setAmount(productDto.getProduct().getAmount());
			productTem.setPrice(productDto.getProduct().getPrice());
			productTem.setDateUpdate(day);
			
			productRepository.save(productTem);
			
			return new ResponService("successful update product", "200", productTem);
			
		}
		
		 return new ResponService("Error the product was not found", "203", null);
	}

	@Override
	public ResponService deleteProduct(ProductDto productDto) throws Exception {
		
		Integer idClient = productDto.getProduct().getClientSerial();
		String reference = productDto.getProduct().getReferenceNumber();
		
		Product productTem = productRepository.findByclientSerialAndIdProduct(idClient, reference);
		
		if(productTem != null) {
			
			
			productRepository.deleteProduct(productTem);
			
			return new ResponService("successful product removed", "200", productTem);
			
		}
		return new ResponService("product not found error", "203", productTem);
	}
	
	

}
