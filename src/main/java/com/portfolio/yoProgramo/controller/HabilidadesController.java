package com.portfolio.yoProgramo.controller;

import Dto.dtoHabilidades;
import com.portfolio.yoProgramo.entity.Habilidades;
import com.portfolio.yoProgramo.security.controller.Mensaje;
import com.portfolio.yoProgramo.service.HabilidadesService;
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
@RequestMapping("habilidades")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadesController {

    @Autowired
    HabilidadesService sHabilidades;

    @GetMapping("/lista")
    public ResponseEntity<List<Habilidades>> list() {
        List<Habilidades> list = sHabilidades.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Habilidades> getById(@PathVariable("id") int id) {
        if (!sHabilidades.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Habilidades habilidades = sHabilidades.getOne(id).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHabilidades.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sHabilidades.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHabilidades dtohab) {
        if (StringUtils.isBlank(dtohab.getNombreSkill())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHabilidades.existsByNombreSkill(dtohab.getNombreSkill())) {
            return new ResponseEntity(new Mensaje("Esa hablidad existe"), HttpStatus.BAD_REQUEST);
        }

        Habilidades habilidades = new Habilidades(
                dtohab.getNombreSkill(),
                dtohab.getDescripcionSkill(),
                dtohab.getNivelSkill());

        sHabilidades.save(habilidades);

        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHabilidades dtohab) {
        //Validamos si existe el ID
        if (!sHabilidades.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de experiencias
        if (sHabilidades.existsByNombreSkill(dtohab.getNombreSkill()) && sHabilidades.getByNombreSkill(dtohab.getNombreSkill()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtohab.getNombreSkill())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Habilidades habilidades = sHabilidades.getOne(id).get();

        habilidades.setDescripcionSkill(dtohab.getDescripcionSkill());
        habilidades.setNombreSkill(dtohab.getNombreSkill());
        habilidades.setNivelSkill(dtohab.getNivelSkill());

        sHabilidades.save(habilidades);

        return new ResponseEntity(new Mensaje("habilidad actualizada"), HttpStatus.OK);
    }
}
