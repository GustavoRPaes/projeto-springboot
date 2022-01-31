package com.gustavo.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
