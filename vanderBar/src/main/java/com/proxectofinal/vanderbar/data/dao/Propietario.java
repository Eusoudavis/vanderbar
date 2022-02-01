package com.proxectofinal.vanderbar.data.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serial;
import java.util.List;

@Data
@Entity
@Table(name = "propietario")
public class Propietario extends Usuario {
    @Serial
    private static final long serialVersionUID = 2204083726707698356L;

    @ManyToMany(mappedBy = "propietarios")
    private List<Local> locais;
}
