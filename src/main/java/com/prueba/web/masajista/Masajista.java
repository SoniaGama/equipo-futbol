package com.prueba.web.masajista;

import com.prueba.web.seleccion.SeleccionFutbol;

public class Masajista extends SeleccionFutbol {
	
	private String titulacion;
	private Integer aniosExperiencia;
	
	public void DarMasaje() {
		System.out.println("Metodo dar masaje");
	}
	
	public String getTitulacion() {
		return titulacion;
	}
	
	public Integer getAniosExperiencia() {
		return aniosExperiencia;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public void setAniosExperiencia(Integer aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
}
