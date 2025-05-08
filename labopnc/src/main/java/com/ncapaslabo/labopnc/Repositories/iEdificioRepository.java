package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Edificio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iEdificioRepository extends iGenericRepository<Edificio, UUID> {

    Edificio findByNombre(String nombre);

    @Query("SELECT E FROM Edificio E WHERE E.ubicacion LIKE %:keyword%")
    List<Edificio> searchByUbicacion(@Param("keyword") String keyword);

    @Query(value = "SELECT * FROM edificio WHERE ubicacion ILIKE %:keyword%", nativeQuery = true)
    List<Edificio> searchByUbicacionNative(@Param("keyword") String keyword);
}
