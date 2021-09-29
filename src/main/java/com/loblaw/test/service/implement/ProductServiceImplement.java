package com.loblaw.test.service.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loblaw.test.converter.ProductConverter;
import com.loblaw.test.dto.ProductDto;
import com.loblaw.test.entity.Products;
import com.loblaw.test.exception.ApiRequestException;
import com.loblaw.test.repository.ProductRepository;
import com.loblaw.test.service.ProductService;

@Service
public class ProductServiceImplement implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	ProductConverter converter;
	
	@Override
	public Optional<Products> findProductById(int Id) {
		return productRepository.findById(Id);
	}
	
	@Override
	public ProductDto updateProduct(ProductDto dto) {
		Optional<Products> fullProduct = findProductById(dto.getProductId()); //  Get old product information stored in database
		ProductDto newDto;
		
		if (fullProduct.isPresent()) {  // Attempt update if product exists and throws error if it does not
			Products product = converter.dtoToEntity(fullProduct, dto);
			productRepository.save(product);
			newDto = converter.entityToDto(product);
		} else {
			throw new ApiRequestException("Product was not found");
		}
		
		return newDto;
	}
}
