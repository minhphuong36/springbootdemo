package com.example.demo_spring_boot.security.service;

import java.util.List;
import java.util.Optional;

public interface GeneralService<T>{
    List<T> findAll();
    Optional<T> findById(Integer id);

    T save(T t);

    void remove(Integer id);
}
