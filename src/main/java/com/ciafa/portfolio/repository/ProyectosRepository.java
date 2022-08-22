package com.ciafa.portfolio.repository;

import com.ciafa.portfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
