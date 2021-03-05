package com.example.fuckMyProject.service;

import com.example.fuckMyProject.model.Role;
import com.example.fuckMyProject.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Collection<Role> findByName(String name) {
        return roleRepository.findByName(name);
    }
}
