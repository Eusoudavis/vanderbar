package com.proxectofinal.vanderbar.data.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Getter
public class ProdutoCartaId implements Serializable {

    @Serial
    private static final long serialVersionUID = 6858498166888429923L;

    @Column(name = "id_produto_carta")
    private Long id_produto_carta;

    @Column(name = "produto")
    private Long id_produto;

    @Column(name = "carta")
    private Long id_carta;
}
