package com.gustavo.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
