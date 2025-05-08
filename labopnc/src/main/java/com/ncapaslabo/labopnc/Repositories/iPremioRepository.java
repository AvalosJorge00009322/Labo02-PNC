package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Transactional
public interface iPremioRepository extends iGenericRepository<Premio, Integer> {
    Premio findByNombre(String nombre);

    @Query("SELECT p FROM Premio p WHERE p.puntosNecesarios <= :puntos")
    List<Premio> findPremiosPorMaximoPuntos(@Param("puntos") int puntos);

    @Query(value = "SELECT * FROM premio WHERE nombre = :nombre", nativeQuery = true)
    Premio findByNombreNative(@Param("nombre") String nombre);


}
