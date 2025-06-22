package com.aspdeveloper.dscatalog2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspdeveloper.dscatalog2.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
