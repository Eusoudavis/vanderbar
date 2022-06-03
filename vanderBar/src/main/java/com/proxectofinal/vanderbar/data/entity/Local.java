package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "local")
public class Local implements Serializable {
    @Serial
    private static final long serialVersionUID = 3539681774637204015L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_local", nullable = false)
    private int id_local;

    @Column(name = "name_local", nullable = false)
    private String name_local;

    @Column(name = "price_range", nullable = false)
    private double price_range;

//    @Column(name = "concello", nullable = false)
//    private Concello concello;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "num", nullable = false)
    private int num;

    @Column(name = "telph", nullable = false)
    private String telph;

    @Column(name = "email", nullable = false)
    private String email;

//    @ManyToMany(cascade = {
//            CascadeType.PERSIST,
//            CascadeType.MERGE
//    })
//    @JoinTable(
//            name = "local_horario",
//            joinColumns = {@JoinColumn(name = "id_local")},
//            inverseJoinColumns = {@JoinColumn(name = "id_horario")}
//    )
//    private List<Horario> horarios;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_type_local",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_local_type")}
    )
    private List<LocalType> localTypes;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_owner",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_user")}
    )
    private List<Owner> owners;

//    @ManyToMany(cascade = {
//            CascadeType.PERSIST,
//            CascadeType.MERGE
//    })
//    @JoinTable(
//            name = "local_cliente",
//            joinColumns = {@JoinColumn(name = "id_local")},
//            inverseJoinColumns = {@JoinColumn(name = "id_usuario")}
//    )
//    private List<Cliente> clientes;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_menu",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_menu")}
    )
    private List<Menu> menus;

   // @Column(name = "estado", nullable = false)
   // private Estado estado;

   // List<TipoLocal> tipoLocalList;
   // List<Carta> cartas;
}
