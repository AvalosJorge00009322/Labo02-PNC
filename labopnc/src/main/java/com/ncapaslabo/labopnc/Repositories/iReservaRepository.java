package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.CanjePremio;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import com.ncapaslabo.labopnc.Domain.Entities.Reserva;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Transactional

public interface iReservaRepository extends iGenericRepository<Reserva, UUID> {

    Reserva findByHuespedIdAndEstado(UUID huespedId, boolean estado);

    @Query("SELECT r FROM Reserva r WHERE r.huesped.id = :huespedId AND r.estado = :estado")
    List<Reserva> findByHuespedAndEstado(@Param("huespedId") UUID huespedId, @Param("estado") boolean estado);

    // Query Nativa - Buscar por fecha de entrada
    @Query(value = "SELECT * FROM reserva WHERE fecha_entrada = :fechaEntrada", nativeQuery = true)
    List<Reserva> findByFechaEntrada(@Param("fechaEntrada") LocalDate fechaEntrada);



}

