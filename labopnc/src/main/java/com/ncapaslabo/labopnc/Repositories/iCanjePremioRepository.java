package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.CanjePremio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Transactional

public interface iCanjePremioRepository extends iGenericRepository<CanjePremio, Long> {

    List<CanjePremio> findByFecha(LocalDate fecha);

    @Query("SELECT p FROM CanjePremio p WHERE p.puntosUsados = :puntosUsados")
    List<CanjePremio> findByPuntosRequeridos(@Param("puntosUsados") int puntosUsados);

    // ✅ Consulta SQL nativa: Buscar por id_huesped
    @Query(value = "SELECT * FROM canje_premio WHERE id_huesped = :huespedId", nativeQuery = true)
    List<CanjePremio> findByHuespedId(@Param("huespedId") UUID huespedId);
}
