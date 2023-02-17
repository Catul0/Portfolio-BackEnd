
package com.portfolio.yoProgramo.security.service;

import com.portfolio.yoProgramo.security.enums.RolNombre;
import com.portfolio.yoProgramo.security.entity.Rol;
import com.portfolio.yoProgramo.security.repository.iRolRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getbyRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}