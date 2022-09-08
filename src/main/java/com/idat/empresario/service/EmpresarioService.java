package com.idat.empresario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.empresario.model.Empresario;
import com.idat.empresario.repository.EmpresarioRepository;

@Service
public class EmpresarioService implements IEmpresarioService{

    @Autowired
    private EmpresarioRepository repository;

    @Override
    public void guardar(Empresario empresario) {
        // TODO Auto-generated method stub
        repository.save(empresario);
    }

    @Override
    public void editar(Empresario empresario) {
        // TODO Auto-generated method stub
        repository.saveAndFlush(empresario);
    }

    @Override
    public void eliminar(int id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

    @Override
    public List<Empresario> listar() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Empresario buscar(int id) {
        // TODO Auto-generated method stub
        return repository.findById(id).orElse(null);
    }
    
}
