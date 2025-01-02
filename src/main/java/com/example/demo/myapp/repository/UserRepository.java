package com.example.demo.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.myapp.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
}
