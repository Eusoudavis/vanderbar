package data;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
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
    private String nome_concello;

    @Column(name = "contrasinal", nullable = false)
    private String contrasinal;

}
