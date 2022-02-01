package com.proxectofinal.vanderbar.data.dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "concello")
public class Concello implements Serializable {
    @Serial
    private static final long serialVersionUID = -4653013837842905408L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_concello")
    private Long id_concello;

    @Column(name = "nome_concello")
    private Long nome_concello;

    @OneToMany
    @JoinColumn(name = "id_concello")
    List<Local> locales;

    @OneToMany
    @JoinColumn(name = "id_concello")
    List<Usuario> usuarios;

}
