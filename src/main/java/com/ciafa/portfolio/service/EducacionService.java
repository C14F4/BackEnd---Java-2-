package com.ciafa.portfolio.service;


import com.ciafa.portfolio.model.Educacion;
import com.ciafa.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educacionrepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return educacionrepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        educacionrepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        educacionrepo.deleteById(id);
    }
    
}
