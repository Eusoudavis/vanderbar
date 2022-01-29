package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {
    @Serial
    private static final long serialVersionUID = -6827447020629410319L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
