package com.proxectofinal.vanderbar.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Data
@Entity
@Table(name = "cliente")
public class Cliente extends Usuario{

    @Serial
    private static final long serialVersionUID = -1510141334132661341L;
}
