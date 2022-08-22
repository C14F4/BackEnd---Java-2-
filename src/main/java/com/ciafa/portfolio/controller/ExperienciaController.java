package com.ciafa.portfolio.controller;

import com.ciafa.portfolio.model.Experiencia;
import com.ciafa.portfolio.service.IExperienciaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService experienciaServ;
    
    @PostMapping ("/experiencia/crear")
    public void agregarExperiencia (@RequestBody Experiencia sk){
        experienciaServ.crearExperiencia(sk);
    }
    
    @PutMapping ("/experiencia/edit")
    public void editarExperiencia (@RequestBody Experiencia sk){
        experienciaServ.crearExperiencia(sk);
    }
    
    @GetMapping ("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return experienciaServ.verExperiencia();
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
    }
    
}