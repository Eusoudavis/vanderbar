package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "horario")
public class Horario implements Serializable {
    @Serial
    private static final long serialVersionUID = -1933810144706086897L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id_horario;

    @ManyToMany(mappedBy = "horarios")
    private List<Local> locais;
}
