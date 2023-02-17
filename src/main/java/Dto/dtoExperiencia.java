package Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
     @NotBlank
    private String nombreExperiencia;
    @NotBlank
    private String descripcionExperiencia;
    @NotBlank
    private String periodoExperiencia;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExperiencia, String descripcionExperiencia, String periodoExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
        this.periodoExperiencia = periodoExperiencia;
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
