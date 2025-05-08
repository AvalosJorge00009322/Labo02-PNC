package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String sucursal;

    @Column(nullable = false)
    private String departamento;

    @Column(nullable = false)
    private String cargo;

    @Column(name = "es_jefe", nullable = false)
    private Boolean esJefe;

    /*@OneToMany(mappedBy = "empleado")
    private List<OrdenMantenimiento> ordenes;

    @OneToMany(mappedBy = "empleado")
    private List<Turno> turnos;*/


}
