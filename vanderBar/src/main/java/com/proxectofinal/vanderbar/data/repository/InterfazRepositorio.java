package com.proxectofinal.vanderbar.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

public interface InterfazRepositorio<T, ID> extends JpaRepository {
    T findById(int id);
}
