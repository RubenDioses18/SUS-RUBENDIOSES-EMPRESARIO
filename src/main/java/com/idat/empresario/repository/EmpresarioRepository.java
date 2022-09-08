package com.idat.empresario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.empresario.model.Empresario;

@Repository
public interface EmpresarioRepository extends JpaRepository<Empresario,Integer>{
    
}
