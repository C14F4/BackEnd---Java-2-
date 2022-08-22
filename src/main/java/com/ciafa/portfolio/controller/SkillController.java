package com.ciafa.portfolio.controller;

import com.ciafa.portfolio.model.Skill;
import com.ciafa.portfolio.service.ISkillService;

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
public class SkillController {
    
    @Autowired
    public ISkillService skillServ;
    
    @PostMapping ("/skill/crear")
    public void agregarSkill (@RequestBody Skill sk){
        skillServ.crearSkill(sk);
    }
    
    @PutMapping ("/skill/edit")
    public void editarSkill (@RequestBody Skill sk){
        skillServ.crearSkill(sk);
    }
    
    @GetMapping ("/skill/ver")
    @ResponseBody
    public List<Skill> verSkill(){
        return skillServ.verSkill();
    }
    
    @DeleteMapping ("/skill/borrar/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
}

