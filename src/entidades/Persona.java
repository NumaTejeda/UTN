package entidades;

import java.time.LocalDateTime;

public class Persona {

	public String nombre;
	public String apellido;
	private LocalDateTime fechaDeNacimiento;
	
	//Metodo utilizado para mostrar de manera legible la informacion de un objeto
	public String toString() {
		return this.getApellido()+", "+this.getNombre();
	}
	
	//Constructo por defecto
	public Persona () {}
	
	//Metod constructor fullName
	public Persona(String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	//Metodo constructor full data
	public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
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
