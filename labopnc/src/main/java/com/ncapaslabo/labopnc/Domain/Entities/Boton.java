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
@Table(name = "boton")
public class Boton {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = "id_piso", nullable = false, foreignKey = @ForeignKey(name="FK_piso"))
    private Piso piso;
}
