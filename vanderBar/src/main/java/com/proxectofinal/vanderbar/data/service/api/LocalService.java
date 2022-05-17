package com.proxectofinal.vanderbar.data.service.api;

import com.proxectofinal.vanderbar.data.entity.Local;

import java.util.List;

public interface LocalService {
    List<Local> findAll();

    void save(Local local);
}
