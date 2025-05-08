package com.ncapaslabo.labopnc.Repositories;

import com.ncapaslabo.labopnc.Domain.Entities.Role;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iRoleRepository extends iGenericRepository<Role, UUID> {

    Role findByName(String name);

    @Query("SELECT r FROM Role r WHERE r.name LIKE %:namePattern%")
    List<Role> searchByNamePattern(@Param("namePattern") String namePattern);

    @Query(value = "SELECT * FROM role WHERE name ILIKE %:namePattern%", nativeQuery = true)
    List<Role> searchByNameNative(@Param("namePattern") String namePattern);

}
