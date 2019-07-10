/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.model;

import java.util.Calendar;
import java.util.TreeMap;

/**
 *
 * @author RICARDO-PC
 */
public class Horario {
    private Integer idHorario;
    private TreeMap<Integer,Pelicula> pelicula;
    private TreeMap <Integer,Sala>Salas;
    private String duracion;
    private Calendar HoraInicial;
	
    public Horario(Integer idHorario, TreeMap pelicula, TreeMap salas, String duracion, Calendar horaInicial) {
		super();
		this.idHorario = idHorario;
		this.pelicula = pelicula;
		Salas = salas;
		this.duracion = duracion;
		HoraInicial = horaInicial;
	}

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public TreeMap getPelicula() {
		return pelicula;
	}

	public void setPelicula(TreeMap pelicula) {
		this.pelicula = pelicula;
	}

	public TreeMap getSalas() {
		return Salas;
	}

	public void setSalas(TreeMap salas) {
		Salas = salas;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Calendar getHoraInicial() {
		return HoraInicial;
	}

	public void setHoraInicial(Calendar horaInicial) {
		HoraInicial = horaInicial;
	}

   
    
    
}
