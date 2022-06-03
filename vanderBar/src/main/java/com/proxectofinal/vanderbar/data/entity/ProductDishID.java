package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class ProductDishID implements Serializable {

    @Serial
    private static final long serialVersionUID = 6858498166888429923L;

    @Column(name = "id_product_dish")
    private Long id_product_dish;

    @Column(name = "product")
    private Long id_product;

    @Column(name = "menu")
    private Long id_menu;
}
