package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "ingrediente")
public class Ingrediente implements Serializable {

    @Serial
    private static final long serialVersionUID = 4640694005511455111L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id_ingrediente;

    @Column(name = "nome_ingrediente", nullable = false)
    private int nome_ingrediente;

    @ManyToMany(mappedBy = "ingredientes")
    private List<Prato> pratos;
}
