package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "drink_type")
public class DrinkType implements Serializable {
    @Serial
    private static final long serialVersionUID = -7949422944951068891L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id_drink_type;

    @Column(name = "name_drink_type", nullable = false)
    private int name_drink_type;

    @ManyToMany(mappedBy = "drinkTypes")
    private List<Drink> drinks;
}
