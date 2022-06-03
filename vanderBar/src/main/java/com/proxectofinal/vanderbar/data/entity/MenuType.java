package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "menu_type")
public class MenuType implements Serializable {
    @Serial
    private static final long serialVersionUID = -8195680671717122010L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_menu_type", nullable = false)
    private int id_menu_type;

    @Column(name = "name_menu_type", nullable = false)
    private String name_menu_type;

    @ManyToMany(mappedBy = "menuTypes")
    private List<Menu> menus;

}
