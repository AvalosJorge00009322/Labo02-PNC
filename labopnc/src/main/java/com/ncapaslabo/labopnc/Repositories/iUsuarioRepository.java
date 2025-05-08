package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Transactional
public interface iUsuarioRepository extends iGenericRepository<Usuario, Integer> {

    Usuario findByCorreo(String nombre);

    @Query("SELECT e FROM Usuario e WHERE LOWER(nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Usuario> searchByNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM usuario WHERE correo ILIKE %:correo%", nativeQuery = true)
    List<Usuario> searchByCorreoNative(@Param("nombre") String nombre);

}
