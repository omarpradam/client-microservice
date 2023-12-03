package com.client.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.client.entity.Product;

@Repository("productRepository")
public interface ProductRespository extends JpaRepository<Product, Serializable>{
	
	@Query(value = "select p.* from product p where p.client_serial = :clientSerial",nativeQuery = true)
	List<Product> findByClient( @Param("clientSerial") Integer clientSerial);
	
	// Product shipment by reference number and customer ID
    @Query(value="select p.* from product p where p.client_serial = :clientSerial and p.reference_number = :referenceNumber", nativeQuery = true)
	Product findByclientSerialAndIdProduct( @Param("clientSerial") Integer clientSerial,  @Param("referenceNumber") String referenceNumber );

}
