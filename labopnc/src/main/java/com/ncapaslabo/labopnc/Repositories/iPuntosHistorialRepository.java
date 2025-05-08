package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.CanjePremio;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import com.ncapaslabo.labopnc.Domain.Entities.PuntosHistorial;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Transactional
public interface iPuntosHistorialRepository extends iGenericRepository<PuntosHistorial, Long> {

    List<PuntosHistorial> findByHuespedId(UUID huespedId);

    @Query("SELECT h.fecha FROM PuntosHistorial h WHERE h.huesped.id = :huespedId ORDER BY h.fecha DESC")
    LocalDate findLastFechaByHuesped(@Param("huespedId") UUID huespedId);

    @Query(value = "SELECT * FROM historial_puntos WHERE huesped_id = :huespedId", nativeQuery = true)
    List<PuntosHistorial> findAllByHuespedId(@Param("huespedId") UUID huespedId);

}
