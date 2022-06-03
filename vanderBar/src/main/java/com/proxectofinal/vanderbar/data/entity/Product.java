package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "product")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = -5518373776624493076L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    private Long id_product;

    @Column(name = "name_product")
    private String name_product;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductDish> productDishes;
}
