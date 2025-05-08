package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private LocalDate fechaEntrada;
    @Column
    private LocalDate fechaSalida;
    @Column
    private String estado;

    @OneToOne
    private ComprobantePago comprobantePago;

    @ManyToOne
    @JoinColumn(name="id_habitacion", foreignKey = @ForeignKey(name="FK_habitacion"))
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name="id_salonEventos", nullable = false, foreignKey = @ForeignKey(name="FK_salonEventos"))
    private SalonEventos salonEventos;

    @ManyToOne
    @JoinColumn(name = "id_huesped", nullable = false, foreignKey = @ForeignKey(name="FK_huesped"))
    private Huesped huesped;


}