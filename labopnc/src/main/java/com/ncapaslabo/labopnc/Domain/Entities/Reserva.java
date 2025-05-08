package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Huesped huesped;


    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String estado;

    @OneToOne
    private ComprobantePago comprobantePago;

    @ManyToOne
    @JoinColumn(name="id_habitacion", foreignKey = @ForeignKey(name="FK_habitacion"))
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name="id_salonEventos", nullable = false, foreignKey = @ForeignKey(name="FK_salonEventos"))
    private SalonEventos salonEventos;




}