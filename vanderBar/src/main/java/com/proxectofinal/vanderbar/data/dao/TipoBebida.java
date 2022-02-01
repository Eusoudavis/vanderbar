package com.proxectofinal.vanderbar.data.dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Tipo_Bebida")
public class TipoBebida implements Serializable {
    @Serial
    private static final long serialVersionUID = -7949422944951068891L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id_tipo_bebida;

    @Column(name = "nome_tipo_bebida", nullable = false)
    private int nome_tipo_bebida;

    @ManyToMany(mappedBy = "tiposBebida")
    private List<Bebida> bebidas;
}
