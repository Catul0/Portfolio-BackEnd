package com.portfolio.yoProgramo.controller;

import Dto.dtoProyectos;
import com.portfolio.yoProgramo.entity.Proyectos;
import com.portfolio.yoProgramo.security.controller.Mensaje;
import com.portfolio.yoProgramo.service.ProyectosService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins={"portfolio-valentin-frontend.web.app","http://localhost:4200"})
public class ProyectosController {

    @Autowired
    ProyectosService sProyectos;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list() {
        List<Proyectos> list = sProyectos.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id) {
        if (!sProyectos.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Proyectos proyectos = sProyectos.getOne(id).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sProyectos.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sProyectos.delete(id);
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyectos dtopro) {
        if (StringUtils.isBlank(dtopro.getNombreProyecto())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sProyectos.existsByNombreProyecto(dtopro.getNombreProyecto())) {
            return new ResponseEntity(new Mensaje("Ese proyecto existe"), HttpStatus.BAD_REQUEST);
        }

        Proyectos proyectos = new Proyectos(
                dtopro.getNombreProyecto(),
                dtopro.getDescripcionProyecto(),
                dtopro.getFechaProyecto(),
                dtopro.getLinkProyecto());

        sProyectos.save(proyectos);

        return new ResponseEntity(new Mensaje("Proyecto agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyectos dtopro) {
        //Validamos si existe el ID
        if (!sProyectos.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de experiencias
        if (sProyectos.existsByNombreProyecto(dtopro.getNombreProyecto()) && sProyectos.getByNombreProyecto(dtopro.getNombreProyecto()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese proyecto ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtopro.getNombreProyecto())) {
            return new ResponseEntity(new Mensaje("El nombre de Proyecto es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Proyectos proyectos = sProyectos.getOne(id).get();

        proyectos.setFechaProyecto(dtopro.getFechaProyecto());
        proyectos.setNombreProyecto(dtopro.getNombreProyecto());
        proyectos.setDescripcionProyecto(dtopro.getDescripcionProyecto());
        proyectos.setLinkProyecto(dtopro.getLinkProyecto());

        sProyectos.save(proyectos);

        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }
}
