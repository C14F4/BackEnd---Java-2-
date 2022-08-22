package com.ciafa.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private String linkGit;
    private String linkDemo;
    
    public Proyectos(){
}
    public Proyectos( Long id,
                    String nombre,
                    String descripcion,
                    String imagen,
                    String linkGit,
                    String linkDemo
                    ){
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.imagen = imagen;
    this.linkGit = linkGit;
    this.linkDemo = linkDemo;
}
}
