/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.model;

import java.io.Serializable;
import java.util.TreeMap;

/**
 *
 * @author RICARDO-PC
 */
public class Cine implements Serializable{
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private TreeMap salas;

    public Cine(String nit, String nombre, String direccion, String telefono) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }    
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TreeMap getSalas() {
        return salas;
    }

    public void setSalas(TreeMap salas) {
        this.salas = salas;
    }
    
    
}
