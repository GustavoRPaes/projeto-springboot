package com.gustavo.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
