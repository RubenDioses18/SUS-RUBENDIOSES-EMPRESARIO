package com.idat.empresario.service;

import java.util.List;

import com.idat.empresario.model.Empresario;

public interface IEmpresarioService {
    public void guardar(Empresario empresario);
    public void editar(Empresario empresario);
    public void eliminar(int id);
    public List<Empresario> listar();
    public Empresario buscar(int id);
}
