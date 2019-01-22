package com.prueba.web.futbolista;

import com.prueba.web.seleccion.SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {
	
	private Integer dorsal;
	private String demarcacion;
	
	public void JugarPartido() {
		System.out.println("metodo jugar partidp");
	}
	
	public void Entrenar() {
		System.out.println("metodo entrenar");
	}
	
	public Integer getDorsal() {
		return dorsal;
	}
	
	public String getDemarcacion() {
		return demarcacion;
	}
	
	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}
	
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
}
