package com.example.codegrill.product.entity;

import org.springframework.data.relational.core.mapping.Table;

@Table
public class Product {
	
	private Long id;
	private String name;
	private int price;
	private int stocks_available;
	private String description;
	
	public Product() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStocks_available() {
		return stocks_available;
	}
	public void setStocks_available(int stocks_available) {
		this.stocks_available = stocks_available;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
