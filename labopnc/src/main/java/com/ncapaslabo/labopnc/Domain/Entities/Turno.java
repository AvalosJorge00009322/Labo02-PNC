package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;

import java.time.YearMonth;

@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_empleado", nullable = false, foreignKey = @ForeignKey(name="FK_empleado"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name="id_piso", nullable = false, foreignKey = @ForeignKey(name="FK_piso"))
    private Piso piso;

    private YearMonth mes;
    private String hora;
    private boolean sigueEnPie;
}