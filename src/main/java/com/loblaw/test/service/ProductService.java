package com.loblaw.test.service;

import java.util.Optional;

import com.loblaw.test.dto.ProductDto;
import com.loblaw.test.entity.Products;

public interface ProductService {
	public Optional<Products> findProductById(int Id);
	public ProductDto updateProduct(ProductDto dto);
}
