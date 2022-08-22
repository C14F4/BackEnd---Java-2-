package com.ciafa.portfolio.service;


import com.ciafa.portfolio.model.Experiencia;
import com.ciafa.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository experienciarepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return experienciarepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia sk) {
        experienciarepo.save(sk);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciarepo.deleteById(id);
    }
    
}
