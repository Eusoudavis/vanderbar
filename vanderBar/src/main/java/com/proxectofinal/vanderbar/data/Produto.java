package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = -5518373776624493076L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_produto")
    private Long id_produto;

    @Column(name = "nome_produto")
    private String nome_produto;

}
