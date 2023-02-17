package com.portfolio.yoProgramo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSkill;
    private String descripcionSkill;
    private String nivelSkill;
    //Contructores, siempre primero 1 vacio y otro lleno

    public Habilidades() {
    }

    public Habilidades(String nombreSkill, String descripcionSkill, String nivelSkill) {
        this.nombreSkill = nombreSkill;
        this.descripcionSkill = descripcionSkill;
        this.nivelSkill = nivelSkill;
    }
    
    //getter and seters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getDescripcionSkill() {
        return descripcionSkill;
    }

    public void setDescripcionSkill(String descripcionSkill) {
        this.descripcionSkill = descripcionSkill;
    }

    public String getNivelSkill() {
        return nivelSkill;
    }

    public void setNivelSkill(String nivelSkill) {
        this.nivelSkill = nivelSkill;
    }
    
}
