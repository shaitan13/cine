/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.model;

/**
 *
 * @author RICARDO-PC
 */
public class Silla {
    private Integer idSilla;
    private Integer numero;
    private String tipo;
    private String estado;
	
    public Silla(Integer idSilla, Integer numero, String tipo, String estado) {
		super();
		this.idSilla = idSilla;
		this.numero = numero;
		this.tipo = tipo;
		this.estado = estado;
	}

	public Integer getIdSilla() {
		return idSilla;
	}

	public void setIdSilla(Integer idSilla) {
		this.idSilla = idSilla;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    
   
    
}
