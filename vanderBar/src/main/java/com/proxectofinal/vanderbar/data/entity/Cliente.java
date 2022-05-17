package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serial;
import java.util.List;

@Data
@Entity
@Table(name = "cliente")
public class Cliente extends Usuario{

    @Serial
    private static final long serialVersionUID = -1510141334132661341L;

//    @ManyToMany(mappedBy = "clientes")
//    private List<Local> locais;
}
