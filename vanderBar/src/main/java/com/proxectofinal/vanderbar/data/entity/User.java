package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 4858200763503532996L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private Long id_user;

    @Column(name = "name_user", nullable = false)
    private String name_user;

    @Column(name = "first_surname", nullable = false)
    private String first_surname;

    @Column(name = "second_surname", nullable = false)
    private String second_surname;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "telf", nullable = false)
    private Integer telf;

    @Column(name = "email", nullable = false)
    private String email;

//    @Column(name = "estado", nullable = false)
//    private String estado;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "name_council", nullable = false)
    private Council council;

    @Column(name = "password", nullable = false)
    private String password;
}
