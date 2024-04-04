package com.FEMA.DirBack.Repositories;

import com.FEMA.DirBack.Entities.Emprendedor;
import com.FEMA.DirBack.Entities.Emprendimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmprendedorRepository extends CrudRepository<Emprendedor, Integer> {
    List<Emprendedor> findAll();

}
