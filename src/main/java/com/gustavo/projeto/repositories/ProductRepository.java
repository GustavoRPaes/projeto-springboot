package com.gustavo.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
