package com.pratiksathaye.example.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratiksathaye.example.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
	User findByFirstname(String firstname);
	
	User findByLastname(String lastname);
}
