package com.client.repository.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.client.entity.Product;
import com.client.repository.ProductRespository;
import com.client.repository.Service.ProductServiceRepository;

@Service("ProductServiceRepositoryImpl")
public class ProductServiceRepositoryImpl implements ProductServiceRepository{

	@Autowired
	@Qualifier("productRepository")
	private ProductRespository productRespository;
	
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRespository.save(product);
	}

	@Override
	public Product findByclientSerialAndIdProduct(Integer clientSerial, String referenceNumber) {
		// TODO Auto-generated method stub
		return productRespository.findByclientSerialAndIdProduct(clientSerial, referenceNumber);
	}

	@Override
	public List<Product> findByIdClient(Integer clientSerial) {
				
		List<Product> product = productRespository.findByClient(clientSerial);
		
		List<Product> productTem = product != null ? product : null;
		return  productTem;
	}

	@Override
	public Product deleteProduct(Product product) {
		productRespository.delete(product);
		return null;
	}

	

	

	

	

}
