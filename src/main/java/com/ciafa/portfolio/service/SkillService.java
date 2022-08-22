package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Skill;
import com.ciafa.portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{

    @Autowired
    public SkillRepository skillrepo;
    
    @Override
    public List<Skill> verSkill() {
        return skillrepo.findAll();
    }

    @Override
    public void crearSkill(Skill sk) {
        skillrepo.save(sk);
    }

    @Override
    public void borrarSkill(Long id) {
        skillrepo.deleteById(id);
    }
    
}
