package com.FEMA.DirBack.Services;

import com.FEMA.DirBack.Entities.Emprendedor;
import com.FEMA.DirBack.Repositories.EmprendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprendedorService {

    private final EmprendedorRepository emprendedorRepository;

    @Autowired
    public EmprendedorService(EmprendedorRepository emprendedorRepository) {
        this.emprendedorRepository = emprendedorRepository;
    }


    public List<Emprendedor> findAllEmprendedores() {
        return emprendedorRepository.findAll();
    }

    public Emprendedor saveEmprendedor(Emprendedor emprendedor) {
        return emprendedorRepository.save(emprendedor);
    }

    public Emprendedor findEmprendedorById(int id) {
        return emprendedorRepository.findById(id).orElse(null);
    }

    public void deleteEmprendedor(int id) {
        emprendedorRepository.deleteById(id);
    }
}