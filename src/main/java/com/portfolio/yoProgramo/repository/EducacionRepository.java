package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findByTitulo(String titulo);
    public boolean existsByTitulo(String titulo);
    
}
