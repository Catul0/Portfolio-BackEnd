package Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String institucion;
    @NotBlank
    private String titulo;
    @NotBlank
    private String descripcion;
    
    
    //constructor
    public dtoEducacion() {
    }

    public dtoEducacion(String institucion, String titulo, String descripcion) {
        this.institucion = institucion;
        this.titulo = titulo;
        this.descripcion = descripcion;

    }
    //Getters and setters 
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}