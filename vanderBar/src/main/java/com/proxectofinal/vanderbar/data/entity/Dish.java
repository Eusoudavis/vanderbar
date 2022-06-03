package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "dish")
public class Dish extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = -5065757635223878034L;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "dish_ingredient",
            joinColumns = {@JoinColumn(name = "id_produt")},
            inverseJoinColumns = {@JoinColumn(name = "id_ingredient")}
    )
    private List<Ingredient> ingredients;
}
