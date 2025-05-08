package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class OrdenMantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_usuario", nullable = false, foreignKey = @ForeignKey(name="FK_user"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="id_habitacion", nullable = false, foreignKey = @ForeignKey(name="FK_habitacion"))
    private Habitacion habitacion;

    private LocalTime hora;
    private LocalDate fecha;
    private String descripcion;


}
