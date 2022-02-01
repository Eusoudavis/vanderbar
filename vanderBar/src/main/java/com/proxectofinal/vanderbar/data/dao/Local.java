package com.proxectofinal.vanderbar.data.dao;

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

    @Column(name = "nome_local", nullable = false)
    private String nomeLocal;

    @Column(name = "rango_prezos", nullable = false)
    private double rangoPrezos;

    @Column(name = "concello", nullable = false)
    private Concello concello;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_horario",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_horario")}
    )
    private List<Horario> horarios;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_tipo_local",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_tipo_local")}
    )
    private List<TipoLocal> tiposLocais;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_propietario",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_usuario")}
    )
    private List<Propietario> propietarios;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_cliente",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_usuario")}
    )
    private List<Cliente> clientes;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "local_carta",
            joinColumns = {@JoinColumn(name = "id_local")},
            inverseJoinColumns = {@JoinColumn(name = "id_carta")}
    )
    private List<Carta> cartas;

   // @Column(name = "estado", nullable = false)
   // private Estado estado;

   // List<TipoLocal> tipoLocalList;
   // List<Carta> cartas;
}
