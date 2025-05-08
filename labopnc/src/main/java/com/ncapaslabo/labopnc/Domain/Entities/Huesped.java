package com.ncapaslabo.labopnc.Domain.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "huesped")
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    /*@ManyToOne
    @JoinColumn(name = "id_reserva", nullable = false)
    private Reserva reserva;

    private int puntos;*/

}
