package com.ciafa.portfolio.controller;

import com.ciafa.portfolio.model.Educacion;
import com.ciafa.portfolio.service.IEducacionService;

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

import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class EducacionController {
    
    @Autowired
    public IEducacionService educacionServ;
    
    @PostMapping ("/educacion/crear")
    public void agregarEducacion (@RequestBody Educacion sk){
        educacionServ.crearEducacion(sk);
    }
    
    @PutMapping ("/educacion/edit")
    public void editarEducacion (@RequestBody Educacion sk){
        educacionServ.crearEducacion(sk);
    }
    
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educacionServ.verEducacion();
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionServ.borrarEducacion(id);
    }
    
}
