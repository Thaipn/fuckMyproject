package com.example.fuckMyProject.repository;

import com.example.fuckMyProject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByEmail(String email);

	@Query("select u from Users u where u.status = 1 order by u.email")
	Collection<Users> findByEmailEnable();
}
