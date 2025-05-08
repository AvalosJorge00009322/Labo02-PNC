package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Piso;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iPisoRepository extends iGenericRepository<Piso, UUID> {

    Piso findByNombre(String nombre);

    @Query("SELECT e FROM Piso e WHERE e.edificio.id = :edificioId")
    List<Piso> findByEdificio(@Param("edificioId") UUID edificioId);

    @Query(value = "SELECT * FROM piso WHERE color_boton ILIKE %:color%", nativeQuery = true)
    List<Piso> findByColorBoton(@Param("color") String color);

}
