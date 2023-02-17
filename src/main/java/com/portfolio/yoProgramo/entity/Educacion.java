package com.portfolio.yoProgramo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String institucion;
    private String descripcion;
    //Contructores, siempre primero 1 vacio y otro lleno

    public Educacion() {
    }

    public Educacion(String titulo, String institucion, String descripcion) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }
     //getter and seters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String Institucion) {
        this.institucion = Institucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
