package com.proxectofinal.vanderbar.data.repository;

import com.proxectofinal.vanderbar.data.entity.Concello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouncilRepository extends JpaRepository<Concello, Integer> {
}
