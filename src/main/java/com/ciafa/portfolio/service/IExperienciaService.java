package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia exp);
    
    public void borrarExperiencia(Long id);
}

