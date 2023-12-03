package com.client.repository.Service;



import java.util.List;

import com.client.entity.Product;

public interface ProductServiceRepository {
	
	public  Product deleteProduct(Product product);

	public Product save(Product product);

	public Product findByclientSerialAndIdProduct(Integer clientSerial, String referenceNumber);
	
	public List<Product> findByIdClient(Integer clientSerial);
}
