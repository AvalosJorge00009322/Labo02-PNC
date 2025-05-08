package com.ncapaslabo.labopnc.Repositories;


import com.ncapaslabo.labopnc.Domain.Entities.Empleado;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iEmpleadoRepository extends  iGenericRepository<Empleado, UUID> {

    //Empleado findByID(UUID id);

    @Query("SELECT * FROM Empleado WHERE e.id = ?1")
    Empleado findEmpleadoById(UUID id);

}
