package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.CanjePremio;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import com.ncapaslabo.labopnc.Domain.Entities.SalonEventos;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Transactional
public interface iSalonEventosRepository extends iGenericRepository<SalonEventos,Long> {

    SalonEventos findByNombre(String nombre);

    @Query("SELECT s FROM SalonEventos s WHERE s.capacidad >= :minCapacidad")
    List<SalonEventos> findSalonesConMinimaCapacidad(@Param("minCapacidad") Integer minCapacidad);

    @Query(value = "SELECT * FROM salon_eventos WHERE descripcion LIKE %:texto%", nativeQuery = true)
    List<SalonEventos> buscarPorDescripcionNative(@Param("texto") String texto);

}
