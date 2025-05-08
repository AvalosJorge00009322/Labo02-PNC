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

@Table(name = "canje_premio")
public class CanjePremio {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_huesped", nullable = false, foreignKey = @ForeignKey(name="FK_huesped"))
    private Huesped huesped;

    @ManyToOne
    @JoinColumn(name = "id_premio", nullable = false, foreignKey = @ForeignKey(name="FK_premio"))
    private Premio premio;

    @Column
    private LocalDate fecha;

    @Column
    private int puntosUsados;
}
