package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Educacion;
import com.portfolio.yoProgramo.repository.EducacionRepository;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository rEducacion;

    public List<Educacion> list() {
        return rEducacion.findAll();
    }

    public Optional<Educacion> getOne(int id) {
        return rEducacion.findById(id);
    }

    public Optional<Educacion> getByTitulo(String titulo) {
        return rEducacion.findByTitulo(titulo);
    }
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByTitulo(String titulo){
        return rEducacion.existsByTitulo(titulo);
    }

}
