package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Empleado;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iEmpleadoRepository extends  iGenericRepository<Empleado, UUID> {

    List<Empleado> findByEsJefe(Boolean esJefe);

    @Query("SELECT e FROM Empleado e WHERE LOWER(e.cargo) LIKE LOWER(CONCAT('%', :cargo, '%'))")
    List<Empleado> searchByCargo(@Param("cargo") String cargo);

    @Query(value = "SELECT * FROM empleado WHERE departamento ILIKE %:departamento%", nativeQuery = true)
    List<Empleado> searchByDepartamentoNative(@Param("departamento") String departamento);
}

