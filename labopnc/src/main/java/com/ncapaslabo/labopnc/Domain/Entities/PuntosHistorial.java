package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "puntos_historial")
public class PuntosHistorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int puntos;
    @Column
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="id_huesped", nullable = false, foreignKey = @ForeignKey(name="FK_huesped"))
    private Huesped huesped;


    @ManyToOne
    @JoinColumn(name="id_empleado", nullable = false, foreignKey = @ForeignKey(name="FK_empleado"))
    private Empleado empleado;
}
