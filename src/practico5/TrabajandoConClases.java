package practico5;

import entidades.Persona;
import entidades.Producto;

public class TrabajandoConClases {
	public static void main(String[] args) {
		/*
		// Crear dos personas
		Persona persona1 = new Persona("Mariana", "Gonzales");
		//persona1.nombre = "Mariana";
		//persona1.apellido = "Gonzales";
		
		Persona persona2 = new Persona();
		persona2.setNombre("Pedro");
		persona2.setApellido("Souza");
		
		System.out.println(persona2.getNombre() + ", "+ persona2.getApellido() + persona1.getApellido());*/
		
		Persona numa = new Persona("Numa", "Tejeda");
		System.out.println(numa.toString());
		
		//Instanciar un producto solo con su nombre
		Producto harina = new Producto("Harina");
		//2 producto  con su nombre, descripcion y peso
		Producto roastBeef = new Producto("RoastBeef", "Carne Vacuna", 5000.0);
		Producto leche = new Producto("Leche", "Producto lacteo ultra pausterizado", 1000.0);
		
		// Instancia un carrito
		Carrito carrito = new Carrito("Numa", "Leche", "RoastBeff");
		System.out.println(carrito.costoFinal());
	}
}
