package com.proxectofinal.vanderbar.data.service.api;

import com.proxectofinal.vanderbar.data.entity.Concello;

import java.util.List;

public interface CouncilService {
    List<Concello> findAll();

    void save(Concello concello);
}
