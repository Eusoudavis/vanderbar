package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "tipo_carta")
public class TipoCarta implements Serializable {
    @Serial
    private static final long serialVersionUID = -8195680671717122010L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_carta", nullable = false)
    private int id_tipo_carta;

    @Column(name = "nome_tipo_carta", nullable = false)
    private String nome_tipo_carta;

    @ManyToMany(mappedBy = "tiposCarta")
    private List<Carta> cartas;

}
