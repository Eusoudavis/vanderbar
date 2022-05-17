package com.proxectofinal.vanderbar.data.service.impl;

import com.proxectofinal.vanderbar.data.entity.Concello;
import com.proxectofinal.vanderbar.data.entity.Local;
import com.proxectofinal.vanderbar.data.repository.CouncilRepository;
import com.proxectofinal.vanderbar.data.service.api.CouncilService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class CouncilImpl implements CouncilService {

    @Autowired
    private CouncilRepository councilRepository;

    @Override
    public List<Concello> findAll() {
        return  councilRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Concello concello){
        councilRepository.save(concello);
    }
}
