package com.proxectofinal.vanderbar.data.repository;

import com.proxectofinal.vanderbar.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}