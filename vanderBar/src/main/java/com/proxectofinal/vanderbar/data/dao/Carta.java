package com.proxectofinal.vanderbar.data.dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "carta")
public class Carta implements Serializable {
    @Serial
    private static final long serialVersionUID = -6319223482625797104L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carta", nullable = false)
    private int id_carta;

    @Column(name = "nome_carta", nullable = false)
    private String nome_carta;

    @Column(name = "epoca_ano", nullable = false)
    private String epoca_ano;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "carta_tipo_carta",
            joinColumns = {@JoinColumn(name = "id_carta")},
            inverseJoinColumns = {@JoinColumn(name = "id_tipo_carta")}
    )
    private List<TipoCarta> tiposCarta;

    @ManyToMany(mappedBy = "cartas")
    private List<Local> locais;

    @OneToMany(mappedBy = "carta", cascade = CascadeType.ALL)
    private List<ProdutoCarta> produtosCarta;
}
