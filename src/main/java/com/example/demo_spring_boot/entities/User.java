package com.example.demo_spring_boot.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String fullName;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinTable(name = "users_roles",
             joinColumns = {@JoinColumn(name="user_id")},
             inverseJoinColumns = {@JoinColumn(name="role_id")})
    private Set<Role> roles;


}
