package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    public List<Proyectos> verProyectos();
    
    public void crearProyectos(Proyectos proyec);
    
    public void borrarProyectos(Long id);
}

