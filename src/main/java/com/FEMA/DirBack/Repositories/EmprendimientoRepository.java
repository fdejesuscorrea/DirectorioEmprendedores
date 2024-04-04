package com.FEMA.DirBack.Repositories;

import com.FEMA.DirBack.Entities.Emprendimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EmprendimientoRepository extends CrudRepository<Emprendimiento, Integer> {
    List<Emprendimiento> findAll();
    Emprendimiento findEmprendimientoById(int id);
}
