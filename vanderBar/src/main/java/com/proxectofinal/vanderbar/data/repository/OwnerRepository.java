package com.proxectofinal.vanderbar.data.repository;

import com.proxectofinal.vanderbar.data.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Propietario, Long> {
}
