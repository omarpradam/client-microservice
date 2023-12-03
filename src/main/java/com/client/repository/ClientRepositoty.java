package com.client.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.entity.Client;

@Repository("userRepository")
public interface ClientRepositoty extends JpaRepository<Client, Serializable>{
	Client findByDocument(String document);
	
}
