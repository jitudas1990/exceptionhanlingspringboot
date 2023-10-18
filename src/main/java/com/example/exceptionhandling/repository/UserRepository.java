package com.example.exceptionhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exceptionhandling.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserId(int id);
}
