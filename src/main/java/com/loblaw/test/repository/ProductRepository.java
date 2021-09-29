package com.loblaw.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loblaw.test.entity.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {

}
