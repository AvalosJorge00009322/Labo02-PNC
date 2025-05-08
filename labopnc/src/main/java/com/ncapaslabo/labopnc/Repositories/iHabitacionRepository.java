package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Empleado;
import com.ncapaslabo.labopnc.Domain.Entities.Habitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iHabitacionRepository extends iGenericRepository<Habitacion, UUID> {

    public Habitacion findByNombre(String nombre);

    @Query("SELECT e FROM Habitacion e WHERE e.piso.id = :pisoId")
    List<Habitacion> findByPiso(@Param("pisoId") UUID pisoId);

    @Query(value = "SELECT * FROM habitacion WHERE descripcion ILIKE %:desc%", nativeQuery = true)
    List<Habitacion> searchByDescripcion(@Param("desc") String desc);
}
