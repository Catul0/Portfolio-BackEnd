package com.portfolio.yoProgramo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreExperiencia;
    private String descripcionExperiencia;
    private String periodoExperiencia;
    //Contructores, siempre primero 1 vacio y otro lleno

    public Experiencia() {
    }

    public Experiencia(String nombreExperiencia, String descripcionExperiencia, String periodoExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
        this.periodoExperiencia = periodoExperiencia;
    }
    //Getter and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }
    
    public String getPeriodoExperiencia() {
        return periodoExperiencia;
    }

    public void setPeriodoExperiencia(String periodoExperiencia) {
        this.periodoExperiencia = periodoExperiencia;
    }

    

}
