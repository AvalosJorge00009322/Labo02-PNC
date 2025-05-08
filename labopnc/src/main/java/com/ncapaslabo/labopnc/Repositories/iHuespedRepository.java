package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Huesped;
import com.ncapaslabo.labopnc.Domain.Entities.Reserva;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iHuespedRepository extends iGenericRepository<Huesped, UUID> {

    List<Huesped> findByReserva(Reserva reserva);

    @Query("SELECT h FROM Huesped h WHERE h.usuario.id = :usuarioId")
    List<Huesped> findByUsuario_Id(@Param("usuarioId") UUID usuarioId);

    @Query(value = "SELECT * FROM huesped WHERE id_reserva = :reservaId", nativeQuery = true)
    List<Huesped> findByReservaIdNative(@Param("reservaId") UUID reservaId);

}
