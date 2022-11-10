package com.example.codegrill.product.utils;

import org.springframework.beans.BeanUtils;

import com.example.codegrill.product.dto.ProductDTO;
import com.example.codegrill.product.entity.Product;

public class ProductUtils {

	public static Product toEntity(ProductDTO dto) {
		Product product = new Product();
		BeanUtils.copyProperties(dto, product);
		return product;
	}
	
	public static ProductDTO toDTO(Product entity) {
		ProductDTO productDTO = new ProductDTO();
		BeanUtils.copyProperties(entity, productDTO);
		return productDTO;
	}
}
