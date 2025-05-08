package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SalonEventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private int capacidad;
    private String descripcion;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservas;
}