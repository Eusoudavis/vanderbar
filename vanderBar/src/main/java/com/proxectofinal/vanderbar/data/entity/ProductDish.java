package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "product_dish")
public class ProductDish implements Serializable {
    @Serial
    private static final long serialVersionUID = -8721730956115910175L;

    @EmbeddedId
    private ProductDishID idProductDish;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "specialty", nullable = false)
    private Boolean specialty;

    @Column(name = "orderable", nullable = false)
    private Boolean orderable;

    @ManyToOne
    @JoinColumn(name = "id_menu", insertable = false, updatable = false)
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;
}
