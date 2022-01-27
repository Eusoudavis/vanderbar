package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Data
@Entity
@Table(name = "propietario")
public class Propietario extends Usuario {
    @Serial
    private static final long serialVersionUID = 2204083726707698356L;
}
