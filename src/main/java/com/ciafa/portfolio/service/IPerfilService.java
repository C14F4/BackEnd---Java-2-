package com.ciafa.portfolio.service;

import com.ciafa.portfolio.model.Perfil;
import java.util.List;


public interface IPerfilService {

    public List<Perfil> verPerfil();
    
    public void editPerfil(Perfil per);
}
