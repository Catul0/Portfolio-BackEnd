package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Habilidades;
import com.portfolio.yoProgramo.repository.HabilidadesRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesService {

    @Autowired
    HabilidadesRepository rHabilidades;

    public List<Habilidades> list() {
        return rHabilidades.findAll();
    }

    public Optional<Habilidades> getOne(int id) {
        return rHabilidades.findById(id);
    }

    public Optional<Habilidades> getByNombreSkill(String nombreSkill) {
        return rHabilidades.findByNombreSkill(nombreSkill);
    }
    public void save(Habilidades hab){
        rHabilidades.save(hab);
    }
    
    public void delete(int id){
        rHabilidades.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHabilidades.existsById(id);
    }
    
    public boolean existsByNombreSkill(String nombreSkill){
        return rHabilidades.existsByNombreSkill(nombreSkill);
    }

}
