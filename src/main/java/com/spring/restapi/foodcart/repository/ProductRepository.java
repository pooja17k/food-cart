package com.spring.restapi.foodcart.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.restapi.foodcart.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query("SELECT p FROM Product p WHERE CONCAT(p.name, p.description) LIKE %?1%")
	public List<Product> search(String keyword);
}
