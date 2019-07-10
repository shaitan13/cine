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
public class Pelicula {
    private Integer idPelicula;
    private String titulo;
    private String genero;
    private String clasificacion;
    private String formato;
    private String decripcion;
	
    public Pelicula(Integer idPelicula, String titulo, String genero, String clasificacion, String formato,
			String decripcion) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.formato = formato;
		this.decripcion = decripcion;
	}

	public Integer getidPelicula() {
		return idPelicula;
	}

	public void setidPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}
	
   
    
}
