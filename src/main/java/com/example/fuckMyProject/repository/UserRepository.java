package com.example.fuckMyProject.repository;

import com.example.fuckMyProject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByEmail(String email);
	Collection<Users> findByEmailEnable(String email, Integer status);
}
