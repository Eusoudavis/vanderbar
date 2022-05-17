package com.proxectofinal.vanderbar.data.service.impl;

import com.proxectofinal.vanderbar.data.entity.Usuario;
import com.proxectofinal.vanderbar.data.repository.UserRepository;
import com.proxectofinal.vanderbar.data.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class UserImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Usuario> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        userRepository.save(usuario);
    }
}
