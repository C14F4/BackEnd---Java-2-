package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Proyectos;
import com.ciafa.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{

    @Autowired
    public ProyectosRepository proyectosrepo;
    
    @Override
    public List<Proyectos> verProyectos() {
        return proyectosrepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos sk) {
        proyectosrepo.save(sk);
    }

    @Override
    public void borrarProyectos(Long id) {
        proyectosrepo.deleteById(id);
    }
    
}