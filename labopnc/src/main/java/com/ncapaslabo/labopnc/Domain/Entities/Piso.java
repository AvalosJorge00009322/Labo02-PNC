package com.ncapaslabo.labopnc.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "piso")

public class Piso {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_boton", nullable = false, foreignKey = @ForeignKey(name="FK_boton"))
    private Boton boton;

    @ManyToOne
    @JoinColumn(name = "id_edificio", nullable = false , foreignKey = @ForeignKey(name="FK_edificio"))
    private Edificio edificio;

    /*@OneToMany(mappedBy = "piso")
    private List<Habitacion> habitaciones;*/

}
