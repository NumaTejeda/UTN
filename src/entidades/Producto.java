package entidades;

import practico5.Descuento;

public class Producto {

	private String nombre;
	private Double precio;
	private Integer stock;
	
	//Constructor
	public Producto(String nombre, Integer stock, Double precio) {
		this.setNombre(nombre);
		this.setStock(stock);
		this.setPrecios(precio);
	}
	//Constructor solo con nombre y precio
	public Producto(String nombre, Double precio){
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String toStrring() {
		return "Nombre: " + this.getNombre() +", PrecioUnitario: " + this.getPrecio() +", Stock: " + this.getStock();
	}
	
	//Getter&Setters nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Getter&Setters Precios
	public double getPrecio() {
		return precio;
	}
	public void setPrecios(Double precio) {
		this.precio = precio;
	}
	//Getter&Setter codigo
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPrecioConDescueto(Descuento descuento) {
		return this.precio - descuento.getValorDescuento();
	}
	
	

	
}
