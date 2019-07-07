/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.model;

import java.util.TreeMap;

/**
 *
 * @author RICARDO-PC
 */
public class Sala {
    private Integer idSala;
    private String tipoSala;
    private TreeMap sillas;

    public Sala(Integer idSala, String tipoSala) {
        this.idSala = idSala;
        this.tipoSala = tipoSala;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public TreeMap getSillas() {
        return sillas;
    }

    public void setSillas(TreeMap sillas) {
        this.sillas = sillas;
    }
    
    
}
