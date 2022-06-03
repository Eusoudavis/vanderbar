package com.proxectofinal.vanderbar.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "council")
public class Council implements Serializable {
    @Serial
    private static final long serialVersionUID = -4653013837842905408L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_council")
    private Long id_council;

    @Column(name = "name_council")
    private String name_council;

    @Column(name = "postal_code")
    private Integer postal_code;

    @OneToMany
    @JoinColumn(name = "id_council")
    private List<Local> locals;

    @OneToMany
    @JoinColumn(name = "id_council")
    private List<User> users;

}
