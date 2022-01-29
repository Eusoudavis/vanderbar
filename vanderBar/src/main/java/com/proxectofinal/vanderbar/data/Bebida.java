package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "bebida")
public class Bebida extends Produto implements Serializable {
    @Serial
    private static final long serialVersionUID = -7708570852377876024L;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "bebida_tipo_bebida",
            joinColumns = {@JoinColumn(name = "id_produto")},
            inverseJoinColumns = {@JoinColumn(name = "id_tipo_bebida")}
    )
    private List<TipoBebida> tiposBebida;
}
