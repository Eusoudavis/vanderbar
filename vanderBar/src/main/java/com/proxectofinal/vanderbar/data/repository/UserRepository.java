package com.proxectofinal.vanderbar.data.repository;

import com.proxectofinal.vanderbar.data.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
}