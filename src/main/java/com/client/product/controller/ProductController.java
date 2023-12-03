package com.client.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.client.dto.ClientDto;
import com.client.dto.ProductDto;
import com.client.dto.ResponService;
import com.client.entity.Client;
import com.client.entity.Product;
import com.client.product.infrastructure.IProductService;
import com.client.repository.Service.impl.ProductServiceRepositoryImpl;


@RestController
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private IProductService iProductService;
	
	@Autowired
	private ProductServiceRepositoryImpl productServiceRepositoryImpl;
	
	private ResponService responService = null;
	
	// create User 
				@PostMapping(value = "/createProduct", produces = MediaType.APPLICATION_JSON_VALUE)
				@ResponseStatus(HttpStatus.OK)
				public @ResponseBody ResponService create(@RequestBody ProductDto productDto) {
					try {
						return iProductService.createProduct(productDto);
					} catch (Exception e) {
						e.getMessage();
						responService = new ResponService("Error", "204", false);
					}
					return responService;
				}
				
				// Uddate User
				@PutMapping(value = "/updateProduct", produces = MediaType.APPLICATION_JSON_VALUE)
				@ResponseStatus(HttpStatus.OK)
				public @ResponseBody ResponService updateProduct(@RequestBody ProductDto productDto) {
					try {
						return iProductService.updateClient(productDto);
					} catch (Exception e) {
						e.getMessage();
						return responService = new ResponService("Error", "404", false);
					}

				}
				
				// serach product

				@GetMapping(value = "/searchByIdClient/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
				@ResponseStatus(HttpStatus.OK)
				public @ResponseBody ResponService searchByClient(@PathVariable Integer idClient) {

					try {

						List<Product> product = productServiceRepositoryImpl.findByIdClient(idClient);					
						return responService = new ResponService("successful", "200", product);

					} catch (Exception e) {
						e.getMessage();
						return responService = new ResponService("Error", "404", false);
					}

				}
				// Delete product
				@DeleteMapping(value = "/deleteProduct", produces = MediaType.APPLICATION_JSON_VALUE)
				@ResponseStatus(HttpStatus.OK)
				public @ResponseBody ResponService deleteProduct(@RequestBody ProductDto productDto) {
					try {
						return iProductService.deleteProduct(productDto);
					} catch (Exception e) {

						return responService = new ResponService(e.getMessage(), "404", false);
					}

				}

		
}
