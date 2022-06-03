package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Data
@Entity
@Table(name = "client")
public class Client extends User {

    @Serial
    private static final long serialVersionUID = -1510141334132661341L;

//    @ManyToMany(mappedBy = "clientes")
//    private List<Local> locais;
}
