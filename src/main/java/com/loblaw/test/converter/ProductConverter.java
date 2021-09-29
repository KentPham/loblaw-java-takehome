package com.loblaw.test.converter;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.loblaw.test.dto.ProductDto;
import com.loblaw.test.entity.Products;

@Component
public class ProductConverter {

	public ProductDto entityToDto(Products product) {
		ProductDto dto = new ProductDto();
		
		dto.setProductId(product.getProductId());
		dto.setName(product.getName());
		dto.setUpc(product.getUpc());
		dto.setStock(product.getStock());
		dto.setMsrp(product.getMsrp());
		
		return dto;
	}
	
	public Products dtoToEntity(Optional<Products> existingProduct, ProductDto dto) {
		Products product = existingProduct.get(); //  Add arguments hidden from user
		
		//  Fill in updated values from dto
		product.setProductId(dto.getProductId());
		product.setName(dto.getName());
		product.setUpc(dto.getUpc());
		product.setStock(dto.getStock());
		product.setMsrp(dto.getMsrp());
		
		return product;
	}
	
}