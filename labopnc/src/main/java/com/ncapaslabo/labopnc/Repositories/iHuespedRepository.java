package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Huesped;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iHuespedRepository extends iGenericRepository<Huesped, UUID> {

    Huesped findByPuntos(String reservaId);

    @Query("SELECT e FROM Huesped e WHERE reserva.id = :reservaId")
    List<Huesped> findByReserva(@Param("reservaId") UUID reservaId);

    @Query(value = "SELECT * FROM huesped WHERE puntos >= :puntos", nativeQuery = true)
    List<Huesped> searchByPuntosNative(@Param("reservaId") UUID reservaId);

}
