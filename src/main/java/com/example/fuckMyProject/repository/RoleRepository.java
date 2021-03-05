package com.example.fuckMyProject.repository;

import com.example.fuckMyProject.model.Role;
import com.example.fuckMyProject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Collection<Role> findByName(String name);
}
