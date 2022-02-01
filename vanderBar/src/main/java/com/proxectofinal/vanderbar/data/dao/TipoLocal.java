package com.proxectofinal.vanderbar.data.dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "tipo_local")
public class TipoLocal implements Serializable {
    @Serial
    private static final long serialVersionUID = -7261179064356206638L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_local", nullable = false)
    private int id_tipo_local;

    @Column(name = "nome_tipo_local", nullable = false)
    private int nome_tipo_local;

    @ManyToMany(mappedBy = "tiposLocais")
    private List<Local> locais;
}
