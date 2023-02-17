package com.portfolio.yoProgramo.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String apellido;
    
    @Lob
    @NotNull
    @Size(min = 1, max = 5000, message = "no cumple con la longitud")
    private String sobreMi;
    
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String banner;
    
    private String img;
    
    private String email;
    
    private String curriculum;
    private String instagram;
    
    private String linkedin;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String sobreMi, String banner, String img, String email, String curriculum, String instagram, String linkedin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobreMi = sobreMi;
        this.banner = banner;
        this.img = img;
        this.email = email;
        this.curriculum = curriculum;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
}
    

