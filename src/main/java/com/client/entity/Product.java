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
@Table(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product")
	private Long idProduct;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "amount")
	private Integer amount;
	@Column(name = "price")
	private Float price;
	@Column(name = "client_serial")
	private Integer clientSerial;
	@Column(name = "date_update")
	private Date dateUpdate;
	@Column(name = "date_create")
	private Date dateCreate;
	@Column(name = "reference_number")
	private String referenceNumber;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long idProduct, String productName, Integer amount, Float price, Integer clientSerial,
			Date dateUpdate, Date dateCreate, String referenceNumber) {
		super();
		this.idProduct = idProduct;
		this.productName = productName;
		this.amount = amount;
		this.price = price;
		this.clientSerial = clientSerial;
		this.dateUpdate = dateUpdate;
		this.dateCreate = dateCreate;
		this.referenceNumber = referenceNumber;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getClientSerial() {
		return clientSerial;
	}

	public void setClientSerial(Integer clientSerial) {
		this.clientSerial = clientSerial;
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

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", productName=" + productName + ", amount=" + amount + ", price="
				+ price + ", clientSerial=" + clientSerial + ", dateUpdate=" + dateUpdate + ", dateCreate=" + dateCreate
				+ ", referenceNumber=" + referenceNumber + "]";
	}

}
