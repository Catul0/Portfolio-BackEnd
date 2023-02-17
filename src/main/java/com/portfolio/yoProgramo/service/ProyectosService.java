package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Proyectos;
import com.portfolio.yoProgramo.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    @Autowired
    ProyectosRepository rProyectos;
    
    public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne(int id){
        return rProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNombreProyecto(String nombreProyecto){
        return rProyectos.findByNombreProyecto(nombreProyecto);
    }
    
    public void save(Proyectos pro){
        rProyectos.save(pro);
    }
    
    public void delete(int id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id);
    }
    
    public boolean existsByNombreProyecto(String nombreProyecto){
        return rProyectos.existsByNombreProyecto(nombreProyecto);
    }
}
