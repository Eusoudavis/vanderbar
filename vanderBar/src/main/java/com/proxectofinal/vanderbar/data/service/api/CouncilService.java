package com.proxectofinal.vanderbar.data.service.api;

import com.proxectofinal.vanderbar.data.entity.Council;

import java.util.List;

public interface CouncilService {
    List<Council> findAll();

    void save(Council council);
}
