package com.prueba.web.entrenador;

import com.prueba.web.seleccion.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {
	
	private String idFederacion;
	
	
	public void DirigirEntrenamiento() {
		System.out.println("metodo dirigir entrenamiento");
	}

	
	public String getIdFederacion() {
		return idFederacion;
	}
	
	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
}
