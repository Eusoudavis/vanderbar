package com.proxectofinal.vanderbar.data.repository;

import com.proxectofinal.vanderbar.data.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends JpaRepository <Local, Integer> {
    List<Local> findAll();
}
