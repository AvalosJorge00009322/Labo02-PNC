package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.ComprobantePago;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


@Transactional
public interface iComprobantePagoRepository extends iGenericRepository<ComprobantePago, Long> {
    List<ComprobantePago> findByReservaId(Long reservaId);

    @Query("SELECT c FROM ComprobantePago c WHERE c.fechaEmision = :fechaEmision")
    List<ComprobantePago> findByFechaEmision(@Param("fechaEmision") LocalDate fechaEmision);


    @Query(value = "SELECT * FROM comprobante_pago WHERE monto_total = :montoTotal", nativeQuery = true)
    List<ComprobantePago> findByMontoTotalNative(@Param("montoTotal") Double montoTotal);

}
