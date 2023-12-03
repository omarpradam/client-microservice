package com.client.product.infrastructure;

import com.client.dto.ProductDto;
import com.client.dto.ResponService;



public interface IProductService {
	public ResponService createProduct (ProductDto productDto) throws Exception;
	public ResponService updateClient(ProductDto productDto)throws Exception;
	public ResponService deleteProduct (ProductDto productDto)throws Exception;
}
