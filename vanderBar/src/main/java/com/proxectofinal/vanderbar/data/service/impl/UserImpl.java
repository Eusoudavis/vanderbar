package com.proxectofinal.vanderbar.data.service.impl;

import com.proxectofinal.vanderbar.data.entity.User;
import com.proxectofinal.vanderbar.data.repository.UserRepository;
import com.proxectofinal.vanderbar.data.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class UserImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
}
