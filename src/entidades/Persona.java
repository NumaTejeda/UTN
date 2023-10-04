package entidades;

import java.time.LocalDateTime;

public class Persona {

	public String nombre;
	public String apellido;
	private LocalDateTime fechaDeNacimiento;
	
	public String toString() {
		return this.getApellido()+", "+this.getNombre();
	}
	
	//Metod constructor
	public Persona(String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	public Persona () {}
	public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}
	
	public int edad() {
		return 3;
	}
	
	// Getter
	public String getNombre() {
		return this.nombre;
	}
	//Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
