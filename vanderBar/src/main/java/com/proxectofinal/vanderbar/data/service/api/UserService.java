package com.proxectofinal.vanderbar.data.service.api;

import com.proxectofinal.vanderbar.data.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);
}
