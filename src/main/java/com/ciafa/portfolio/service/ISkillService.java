package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> verSkill();
    
    public void crearSkill(Skill sk);
    
    public void borrarSkill(Long id);
    
}
