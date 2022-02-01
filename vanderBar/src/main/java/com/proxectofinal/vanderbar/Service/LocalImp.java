package com.proxectofinal.vanderbar.Service;

import com.proxectofinal.vanderbar.Service.Interfaces.InterfazService;
import com.proxectofinal.vanderbar.data.repository.InterfazRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class LocalImp implements InterfazService {
    @Autowired
    private InterfazRepositorio interfazRepositorio;

    //https://learntutorials.net/es/spring-boot/topic/6203/spring-boot-plus-spring-data-jpa
}
