package com.client.entity;

import java.io.Serializable;
import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="client")
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_serial")
	private Long serial;
	
	@Column(name = "first_name")
	private String name;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "document")
	private String document;
	@Column(name = "email")
	private String email;
	@Column(name = "date_update")
	private Date dateUpdate;
	@Column(name = "date_create")
	private Date dateCreate;
	

	public Client() {
		super();

	}

	public Client( String name, String lastName, String document, String email, Date dateUpdate,
			Date dateCreate, Long serial) {
		
		this.name = name;
		this.lastName = lastName;
		this.document = document;
		this.email = email;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
		this.serial = serial;

	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Client [serial=" + serial + ", name=" + name + ", lastName=" + lastName + ", document=" + document
				+ ", email=" + email + ", dateUpdate=" + dateUpdate + ", dateCreate=" + dateCreate + "]";
	}



}
