package com.idat.empresario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.empresario.model.Empresario;
import com.idat.empresario.service.IEmpresarioService;

@RestController
@RequestMapping("/empresario")
public class EmpresarioController {

    @Autowired
    private IEmpresarioService service;

    @GetMapping
    public ResponseEntity<List<Empresario>> listar() {
        List<Empresario> lista = service.listar();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Empresario> buscarPorId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.buscar(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Empresario empresario) {
        try {
            service.guardar(empresario);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Empresario> editar(@PathVariable("id") int id, @RequestBody Empresario empresario) {
        try {
           service.editar(empresario);
           return new ResponseEntity<Empresario>(HttpStatus.OK); 
        } catch (Exception e) {
        return new ResponseEntity<Empresario>(HttpStatus.BAD_REQUEST); 
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
        try {
            service.eliminar(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}