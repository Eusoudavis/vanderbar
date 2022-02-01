package com.proxectofinal.vanderbar.data.dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "produto_carta")
public class ProdutoCarta implements Serializable {
    @Serial
    private static final long serialVersionUID = -8721730956115910175L;

    @EmbeddedId
    private ProdutoCartaId idProdutoCarta;

    @Column(name = "prezo", nullable = false)
    private Double prezo;

    @Column(name = "especialidade", nullable = false)
    private Boolean especialidade;

    @Column(name = "encargo", nullable = false)
    private Boolean encargo;

    @ManyToOne
    @JoinColumn(name = "id_carta", insertable = false, updatable = false)
    private Carta carta;

    @ManyToOne
    @JoinColumn(name = "id_produto", insertable = false, updatable = false)
    private Produto produto;


}
