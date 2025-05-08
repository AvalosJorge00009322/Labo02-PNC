package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "turno")
@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private YearMonth mes;
    @Column
    private String hora;
    @Column
    private boolean sigueEnPie;

    @ManyToOne
    @JoinColumn(name="id_empleado", nullable = false, foreignKey = @ForeignKey(name="FK_empleado"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name="id_piso", nullable = false, foreignKey = @ForeignKey(name="FK_piso"))
    private Piso piso;


}