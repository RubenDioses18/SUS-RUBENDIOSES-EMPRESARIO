package com.idat.empresario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "empresario")
@Entity
@Data
public class Empresario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresario;
    private String nombre;
    private String apellido;
    private String celular;
}
