package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serial;
import java.util.List;

@Data
@Entity
@Table(name = "owner")
public class Owner extends User {
    @Serial
    private static final long serialVersionUID = 2204083726707698356L;

    @ManyToMany(mappedBy = "owners")
    private List<Local> locais;
}
