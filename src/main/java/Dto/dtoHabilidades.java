package Dto;

import javax.validation.constraints.NotBlank;

public class dtoHabilidades {
    
    @NotBlank
    private String nombreSkill;
    @NotBlank
    private String descripcionSkill;
    @NotBlank
    private String nivelSkill;

    public dtoHabilidades() {
    }

    public dtoHabilidades(String nombreSkill, String descripcionSkill, String nivelSkill) {
        this.nombreSkill = nombreSkill;
        this.descripcionSkill = descripcionSkill;
        this.nivelSkill = nivelSkill;
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
