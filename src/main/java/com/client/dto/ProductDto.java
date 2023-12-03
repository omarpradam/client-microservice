package com.client.dto;

import org.springframework.stereotype.Component;

import com.client.entity.Product;

@Component
public class ProductDto {

	private Product product;

	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDto(Product product) {
		super();
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductDto [product=" + product + "]";
	}

}
