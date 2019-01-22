package com.prueba.web.seleccion;

public class SeleccionFutbol {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer edad;
	
	public void Concentrarse () {
		System.out.println("metodo concentrarse");
	}
	
	public void Viajar () {
		System.out.println("metodo viajar");
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	
	public void setLastName(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setAge(Integer edad) {
		this.edad = edad;
	}

}
