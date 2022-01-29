package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "prato")
public class Prato extends Produto implements Serializable {
    @Serial
    private static final long serialVersionUID = -5065757635223878034L;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "prato_ingrediente",
            joinColumns = {@JoinColumn(name = "id_produto")},
            inverseJoinColumns = {@JoinColumn(name = "id_ingrediente")}
    )
    private List<Ingrediente> ingredientes;
}
