package com.prueba.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

import com.prueba.web.seleccion.SeleccionFutbol;
import com.prueba.web.futbolista.Futbolista;
import com.prueba.web.entrenador.Entrenador;
import com.prueba.web.masajista.Masajista;


@SpringBootApplication
public class EquipoFutbolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipoFutbolApplication.class, args);
		
		//instanciar 
		Futbolista futbolistaOne = new Futbolista();
		Entrenador entrenadorOne = new Entrenador();
		Masajista masajistaOne = new Masajista();
		
		//Crear lista
		List<SeleccionFutbol> listaSeleccionados = new ArrayList<SeleccionFutbol>();
		
		listaSeleccionados.add(futbolistaOne);
		listaSeleccionados.add(entrenadorOne);
		listaSeleccionados.add(masajistaOne);
		
		//iterar e imprimir el metodo concentarse
		
	}

}

