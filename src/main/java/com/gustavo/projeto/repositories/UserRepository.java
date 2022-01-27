package com.gustavo.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
