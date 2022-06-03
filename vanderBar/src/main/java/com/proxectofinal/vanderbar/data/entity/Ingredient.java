package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "ingredient")
public class Ingredient implements Serializable {

    @Serial
    private static final long serialVersionUID = 4640694005511455111L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id_ingredient;

    @Column(name = "ingredient_name", nullable = false)
    private int ingredient_name;

    @ManyToMany(mappedBy = "ingredients")
    private List<Dish> dishes;
}
