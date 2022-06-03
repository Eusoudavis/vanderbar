package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "drink")
public class Drink extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = -7708570852377876024L;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "drink_type_drink",
            joinColumns = {@JoinColumn(name = "id_product")},
            inverseJoinColumns = {@JoinColumn(name = "id_drink_type")}
    )
    private List<DrinkType> drinkTypes;
}
