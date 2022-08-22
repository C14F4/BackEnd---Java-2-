package com.ciafa.portfolio.controller;

import com.ciafa.portfolio.model.Proyectos;
import com.ciafa.portfolio.service.IProyectosService;

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
public class ProyectosController {
    
    @Autowired
    public IProyectosService proyectosServ;
    
    @PostMapping ("/proyectos/crear")
    public void agregarProyectos (@RequestBody Proyectos sk){
        proyectosServ.crearProyectos(sk);
    }
    
    @PutMapping ("/proyectos/edit")
    public void editarProyectos (@RequestBody Proyectos sk){
        proyectosServ.crearProyectos(sk);
    }
    
    @GetMapping ("/proyectos/ver")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proyectosServ.verProyectos();
    }
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public void borrarProyectos(@PathVariable Long id){
        proyectosServ.borrarProyectos(id);
    }
    
}