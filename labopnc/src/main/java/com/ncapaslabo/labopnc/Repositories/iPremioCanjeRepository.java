package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.CanjePremio;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


@Transactional

public interface iPremioCanjeRepository extends iGenericRepository<CanjePremio, Long> {

    List<CanjePremio> findByFecha(LocalDate fecha);

    @Query("SELECT p FROM CanjePremio p WHERE p.puntosUsados = :puntosUsados")
    List<CanjePremio> findByPuntosRequeridos(@Param("puntosUsados") int puntosUsados);

    // ✅ Consulta SQL nativa: Buscar por id_huesped
    @Query(value = "SELECT * FROM premio_cambio WHERE id_huesped = :huespedId", nativeQuery = true)
    List<CanjePremio> findByHuespedId(@Param("huespedId") Long huespedId);
}
