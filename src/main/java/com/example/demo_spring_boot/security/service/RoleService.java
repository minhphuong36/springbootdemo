package com.example.demo_spring_boot.security.service;

import com.example.demo_spring_boot.entities.Role;

public interface RoleService extends GeneralService<Role> {
    Role findByName(String name);
}
