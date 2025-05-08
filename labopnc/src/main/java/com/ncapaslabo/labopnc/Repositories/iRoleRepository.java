package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Role;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iRoleRepository extends iGenericRepository<Role, UUID> {

    Role findByNombre(String pattern);

    @Query("SELECT e FROM Role e WHERE nombre LIKE %:pattern%")
    List<Role> searchByNombrePattern(@Param("pattern") String pattern);

    @Query(value = "SELECT * FROM role WHERE nombre ILIKE %:pattern%", nativeQuery = true)
    List<Role> searchByNombreNative(@Param("pattern") String pattern);

}
