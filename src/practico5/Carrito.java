package practico5;

import entidades.Producto;
import entidades.Persona;

public class Carrito {
	
	private Persona Persona;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Double precio;
	
	//Constructor 
	public Carrito(Persona persona, Producto producto1, Producto producto2, Producto producto3) {
		this.Persona = persona;
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
	}
	//Deberia retornar la suma del costo de los productos de carrito
	public String datosPantalla() {
		return  "Cantidad // Producto // Precio Unitario \n" +
				this.getProducto1().getCantidad()+" "+this.getProducto1().getNombre()+" "+ this.getProducto1().getPrecios()+"\n"+
				this.getProducto2().getCantidad()+" "+this.getProducto2().getNombre()+" "+ this.getProducto2().getPrecios()+"\n"+
				this.getProducto3().getCantidad()+" "+this.getProducto3().getNombre()+" "+ this.getProducto3().getPrecios()+
				"\nCosto total: "+this.setPrecio();
	}
	
	public Double getPrecio() {
		return precio;
	}
	public Double setPrecio() {
		precio = producto1.getPrecios()*producto1.getCantidad()+
				producto2.getPrecios()*producto2.getCantidad()+
				producto3.getPrecios()*producto3.getCantidad();
		return precio;
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
