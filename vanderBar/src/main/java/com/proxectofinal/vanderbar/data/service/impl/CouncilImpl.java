package com.proxectofinal.vanderbar.data.service.impl;

import com.proxectofinal.vanderbar.data.entity.Council;
import com.proxectofinal.vanderbar.data.repository.CouncilRepository;
import com.proxectofinal.vanderbar.data.service.api.CouncilService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class CouncilImpl implements CouncilService {

    @Autowired
    private CouncilRepository councilRepository;

    @Override
    public List<Council> findAll() {
        return  councilRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Council council){
        councilRepository.save(council);
    }
}
