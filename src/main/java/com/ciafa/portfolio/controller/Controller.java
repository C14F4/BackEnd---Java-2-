package com.ciafa.portfolio.controller;

import com.ciafa.portfolio.model.Perfil;
import com.ciafa.portfolio.service.IPerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
    
    @Autowired
    public IPerfilService perfilServ;
    
    @PutMapping ("/perfil/edit")
    public void editPerfil(@RequestBody Perfil perf){
        perfilServ.editPerfil(perf);
    }
    
    @GetMapping ("/perfil/ver")
    @ResponseBody
    public List<Perfil> verPerfil(){
       return perfilServ.verPerfil();
    }
    
}
