package com.ciafa.portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Perfil implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String profesion;
    private String lugar;
    private String fotoBanner;
    private String fotoPerfil;
    private String acercaDe;
    private String redFb;
    private String redTw;
    private String redIg;
    private String redGit;
    
    public Perfil(){
}
    public Perfil( Long id,
                    String nombre,
                    String profesion,
                    String lugar,
                    String fotoBanner,
                    String fotoPerfil,
                    String acercaDe,
                    String redFb,
                    String redTw,
                    String redIg,
                    String redGit){
    this.nombre = nombre;
    this.profesion = profesion;
    this.lugar = lugar;
    this.fotoBanner = fotoBanner;
    this.fotoPerfil = fotoPerfil;
    this.acercaDe = acercaDe;
    this.redFb = redFb;
    this.redTw = redTw;
    this.redIg = redIg;
    this.redGit = redGit;
}
}
