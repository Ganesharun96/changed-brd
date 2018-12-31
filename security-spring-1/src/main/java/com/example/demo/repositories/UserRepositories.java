package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Usersdetails;

@Repository
public interface UserRepositories extends JpaRepository<Usersdetails, Integer> {

	Usersdetails findByUsername(String username);

}
