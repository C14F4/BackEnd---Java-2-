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
public class Skill implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String imagen;
    private int porcentaje;
    
    public Skill(){
}
    public Skill( Long id,
                    String nombre,
                    String imagen,
                    int porcentaje
                    ){
    this.id = id;
    this.nombre = nombre;
    this.imagen = imagen;
    this.porcentaje = porcentaje;
}
}

