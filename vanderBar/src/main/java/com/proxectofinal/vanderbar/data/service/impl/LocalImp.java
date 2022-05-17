package com.proxectofinal.vanderbar.data.service.impl;

import com.proxectofinal.vanderbar.data.service.api.LocalService;
import com.proxectofinal.vanderbar.data.entity.Local;
import com.proxectofinal.vanderbar.data.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LocalImp implements LocalService {
    @Autowired
    private LocalRepository localRepositorio;

    @Override
    public List<Local> findAll() {
        return localRepositorio.findAll();
    }

    @Override
    @Transactional
    public void save(Local local){
        localRepositorio.save(local);
    }


    //https://learntutorials.net/es/spring-boot/topic/6203/spring-boot-plus-spring-data-jpa
}
