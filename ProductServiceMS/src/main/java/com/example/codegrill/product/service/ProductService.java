package com.example.codegrill.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.codegrill.product.dto.ProductDTO;
import com.example.codegrill.product.repo.ProductRepo;
import com.example.codegrill.product.utils.ProductUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;
	
	public Flux<ProductDTO> getProducts() {
		return repo.findAll()
				.map(ProductUtils::toDTO);
	}
	
	public Mono<ProductDTO> insertProduct(Mono<ProductDTO> dto) {
		return dto.map(ProductUtils::toEntity)
			.flatMap(repo::save)
			.map(ProductUtils::toDTO);
	}
	
	public Mono<ProductDTO> getProductById(Long id) {
		return repo.findById(id)
			.map(ProductUtils::toDTO);
	}
	
	public Mono<ProductDTO> updateProduct(Long id, Mono<ProductDTO> dto) {
		return repo.findById(id)
			.flatMap(p -> dto.map(ProductUtils::toEntity)
						.doOnNext(e -> e.setId(id)))
				.flatMap(repo::save)
				.map(ProductUtils::toDTO);
	}
	
	public Mono<Void> deleteProduct(Long id) {
		return repo.deleteById(id);
	}

}
