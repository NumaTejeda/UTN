package practico5;

import java.time.LocalDate;

import entidades.Producto;
import entidades.Persona;

public class Carrito {
	
	private Persona Persona;
	
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	
	LocalDate fechaCompra;
	
	public Carrito() {
		this.fechaCompra = LocalDate.now();
	}
	//Deberia retornar la suma del costo de los productos de carrito
	public Double costoFinal() {
		return this.getProducto1().getPrecios() +
				this.getProducto2().getPrecios();
	}
	public Persona getPersona() {
		return Persona;
	}
	public void setPersona(Persona persona) {
		Persona = persona;
	}
	public Producto getProducto1() {
		return producto1;
	}
	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}
	public Producto getProducto2() {
		return producto2;
	}
	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}
	public Producto getProducto3() {
		return producto3;
	}
	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	
}	
