package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category_code")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="category_code")
	private Integer categoryCode;
	
	public Integer getCategoryCode() {
		return categoryCode;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Column(name="categoryname")
	private String categoryname;
}