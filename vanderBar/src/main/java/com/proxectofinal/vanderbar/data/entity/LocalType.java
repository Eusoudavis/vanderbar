package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "local_type")
public class LocalType implements Serializable {
    @Serial
    private static final long serialVersionUID = -7261179064356206638L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_local_type", nullable = false)
    private int id_local_type;

    @Column(name = "name_local_type", nullable = false)
    private int name_local_type;

    @ManyToMany(mappedBy = "localTypes")
    private List<Local> localList;
}
