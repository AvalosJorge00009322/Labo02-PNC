package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.CanjePremio;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import com.ncapaslabo.labopnc.Domain.Entities.Turno;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Transactional
public interface iTurnosRepository extends iGenericRepository<Turno, Long> {
    Turno findByNombre(String nombre);

    @Query("SELECT t FROM Turno t WHERE t.estado = true")
    List<Turno> findTurnosActivos();


    @Query(value = "SELECT * FROM turno WHERE hora = :hora AND mes = :mes", nativeQuery = true)
    List<Turno> findTurnosPorHoraYMesNative(@Param("hora") String hora, @Param("mes") String mes);

}
