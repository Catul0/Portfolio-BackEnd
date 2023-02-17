package Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String sobreMi;
    @NotBlank
    private String curriculum;
    @NotBlank
    private String banner;
    @NotBlank
    private String email;
    @NotBlank
    private String img;
    @NotBlank
    private String instagram;
    @NotBlank
    private String linkedin;
   

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String sobreMi, String banner,String curriculum, String email, String img, String instagram, String linkedin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobreMi = sobreMi;
        this.banner = banner;
        this.curriculum = curriculum;
        this.email = email;
        this.img = img;
        this.instagram = instagram;
        this.linkedin = linkedin;

    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum){
        this.curriculum = curriculum;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}