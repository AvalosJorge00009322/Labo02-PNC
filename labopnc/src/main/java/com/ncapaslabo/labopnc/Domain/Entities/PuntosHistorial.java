package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class PuntosHistorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_huesped", nullable = false, foreignKey = @ForeignKey(name="FK_huesped"))
    private Huesped huesped;

    private int puntos;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="id_empleado", nullable = false, foreignKey = @ForeignKey(name="FK_empleado"))
    private Empleado empleado;
}
