package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.OrdenMantenimiento;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


@Transactional
public interface iOrdenMantenimientoRepository extends iGenericRepository<OrdenMantenimiento, Long> {

    List<OrdenMantenimiento> findByFecha(LocalDate fecha);

    @Query("SELECT o.descripcion FROM OrdenMantenimiento o WHERE o.id = :ordenId")
    String findDescripcionByOrdenId(@Param("ordenId") Long ordenId);

    @Query(value = "SELECT * FROM orden_mantenimiento WHERE id_empleado = :empleadoId", nativeQuery = true)
    List<OrdenMantenimiento> findOrdenesPorEmpleadoNative(@Param("empleadoId") Long empleadoId);


}
