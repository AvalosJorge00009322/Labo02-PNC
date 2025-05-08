package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ComprobantePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float montoTotal;
    private LocalDate fechaEmision;

    @ManyToOne
    @JoinColumn(name = "id_reserva", nullable = false)
    private Reserva reserva;

}