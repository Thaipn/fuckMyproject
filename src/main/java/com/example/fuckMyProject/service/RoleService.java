package com.example.fuckMyProject.service;

import com.example.fuckMyProject.model.Role;

import java.util.Collection;
public interface RoleService  {
    Collection<Role> findByName(String name);
}
