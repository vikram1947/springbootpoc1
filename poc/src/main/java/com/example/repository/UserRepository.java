package com.example.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


	
	List<User> findByName(String name);

	List<User> findBySurName(String surName);

	List<User> findByPincode(String pincode);




	
	
}

