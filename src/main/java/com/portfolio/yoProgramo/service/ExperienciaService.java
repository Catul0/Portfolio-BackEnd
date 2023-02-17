package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Experiencia;
import com.portfolio.yoProgramo.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    @Autowired
    ExperienciaRepository rExperiencia;

    public List<Experiencia> list() {
        return rExperiencia.findAll();
    }

    public Optional<Experiencia> getOne(int id) {
        return rExperiencia.findById(id);
    }

    public Optional<Experiencia> getByNombreExperiencia(String nombreExperiencia) {
        return rExperiencia.findByNombreExperiencia(nombreExperiencia);
    }
    public void save(Experiencia exp){
        rExperiencia.save(exp);
    }
    
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByNombreExperiencia(String nombreExperiencia){
        return rExperiencia.existsByNombreExperiencia(nombreExperiencia);
    }
}
