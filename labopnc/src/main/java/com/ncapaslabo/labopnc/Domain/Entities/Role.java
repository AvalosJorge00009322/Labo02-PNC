package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRole;

    @Column
    private String name;

    /*@OneToMany(mappedBy = "role")
    private List<Usuario> usuarios;*/
}
