package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuario")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class Usuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 4858200763503532996L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUsuario", nullable = false)
    private Long idUsuario;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "apelido1", nullable = false)
    private String apelido1;

    @Column(name = "apelido2", nullable = false)
    private String apelido2;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "telefono", nullable = false)
    private int telefono;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "rol", nullable = false)
    private String rol;

    @Column(name = "nome_concello", nullable = false)
    private Concello concello;

    @Column(name = "contrasinal", nullable = false)
    private String contrasinal;
}
