package com.proxectofinal.vanderbar.data.service.api;

import com.proxectofinal.vanderbar.data.entity.Usuario;

import java.util.List;

public interface UserService {
    List<Usuario> findAll();

    void save(Usuario usuario);
}
