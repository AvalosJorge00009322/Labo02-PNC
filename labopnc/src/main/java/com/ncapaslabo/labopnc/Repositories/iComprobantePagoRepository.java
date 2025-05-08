package com.ncapaslabo.labopnc.Repositories;
import com.ncapaslabo.labopnc.Domain.Entities.ComprobantePago;
import com.ncapaslabo.labopnc.Domain.Entities.Premio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Transactional
public interface iComprobantePagoRepository extends iGenericRepository<ComprobantePago, Integer> {

}
