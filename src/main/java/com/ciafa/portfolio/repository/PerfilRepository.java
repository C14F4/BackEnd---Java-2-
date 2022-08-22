package com.ciafa.portfolio.repository;

import com.ciafa.portfolio.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository <Perfil,Long> {
    
}
