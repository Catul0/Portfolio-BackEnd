package Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    private String fechaProyecto;
    @NotBlank
    private String nombreProyecto;
    @NotBlank
    private String descripcionProyecto;
    @NotBlank
    private String linkProyecto;
  

    public dtoProyectos() {
    }

    public dtoProyectos(String fechaProyecto, String nombreProyecto, String descripcionProyecto, String linkProyecto) {
        this.fechaProyecto = fechaProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.linkProyecto = linkProyecto;
    }

    public String getFechaProyecto() {
        return fechaProyecto;
    }

    public void setFechaProyecto(String fechaProyecto) {
        this.fechaProyecto = fechaProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getLinkProyecto() {
        return linkProyecto;
    }

    public void setLinkProyecto(String linkProyecto) {
        this.linkProyecto = linkProyecto;
    }
}
