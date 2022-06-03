package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "menu")
public class Menu implements Serializable {
    @Serial
    private static final long serialVersionUID = -6319223482625797104L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_menu", nullable = false)
    private int id_menu;

    @Column(name = "name_menu", nullable = false)
    private String name_menu;

    @Column(name = "season", nullable = false)
    private String season;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "menu_type_menu",
            joinColumns = {@JoinColumn(name = "id_menu")},
            inverseJoinColumns = {@JoinColumn(name = "id_menu_type")}
    )
    private List<MenuType> menuTypes;

    @ManyToMany(mappedBy = "menus")
    private List<Local> locals;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<ProductDish> productDishes;
}
