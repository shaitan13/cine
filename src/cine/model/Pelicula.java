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
    private String idPelicula;
    private String titulo;
    private String genero;
    private String clasificacion;
    private String formato;
    private String descripcion;
	
    public Pelicula(String idPelicula, String titulo, String genero, String clasificacion, String formato,
			String decripcion) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.formato = formato;
		this.descripcion = decripcion;
	}

	public String getidPelicula() {
		return idPelicula;
	}

	public void setidPelicula(String idPelicula) {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
   
    
}
