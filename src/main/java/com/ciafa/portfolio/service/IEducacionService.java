package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
}
