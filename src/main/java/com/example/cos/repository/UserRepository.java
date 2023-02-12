package com.example.cos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cos.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
