package com.aspdeveloper.dscatalog2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspdeveloper.dscatalog2.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
