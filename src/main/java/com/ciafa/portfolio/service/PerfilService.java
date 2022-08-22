package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Perfil;
import com.ciafa.portfolio.repository.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService{

    @Autowired
    public PerfilRepository perfilRepo;
    
    @Override
    public List<Perfil> verPerfil() {
        return perfilRepo.findAll();
    }

    @Override
    public void editPerfil(Perfil per) {
        perfilRepo.save(per);
    }
    
}
