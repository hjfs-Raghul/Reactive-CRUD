package com.example.codegrill.product.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductDTO {
	private String name;
	private int price;
	private int stocks_available;
	private String description;
}
