package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orden_mantenimiento")
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

    @Column
    private LocalTime hora;
    @Column
    private LocalDate fecha;
    @Column
    private String descripcion;


}
