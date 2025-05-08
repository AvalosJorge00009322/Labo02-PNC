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
@Table(name = "salon_eventos")
public class SalonEventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private int capacidad;
    @Column
    private String descripcion;

    /*@OneToMany(mappedBy = "salon")
    private List<Reserva> reservas;*/
}