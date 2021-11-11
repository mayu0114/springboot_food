package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Foods")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code")
	private Integer code;
	
	@Column(name="category_code")
	private Integer categoryCode;
	
	@Column(name="name")
	private String name;

	@Column(name="purchase_date")
	private Date purchaseDate;
	
	@Column(name="opening_date")
	private Date openingDate;
	
	@Column(name="expiry_date")
	private Date expiryDate;
	
	public Food() {
	}

	public Food(Integer code, Integer categoryCode, String name, Date purchaseDate, Date openingDate, Date expiryDate) {
		this.code = code;
		this.categoryCode = categoryCode;
		this.name = name;
		this.purchaseDate = purchaseDate;
		this.openingDate = openingDate;
		this.expiryDate = expiryDate;
	}

	public Food(Integer categoryCode, String name, Date purchasedate, Date openingdate, Date expiryDate) {
		this.categoryCode = categoryCode;
		this.name = name;
		this.purchaseDate = purchasedate;
		this.openingDate = openingdate;
		this.expiryDate = expiryDate;
	}

	public Integer getCode() {
		return code;
	}

	public Integer getCategoryCode() {
		return categoryCode;
	}

	public String getName() {
		return name;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
}
	
