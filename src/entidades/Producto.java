package entidades;


public class Producto {

	private String nombre;
	private Double precios;
	private Integer cantidad;
	
	//Constructor
	public Producto(String nombre, Integer cantidad, Double precios) {
		this.setNombre(nombre);
		this.setCantidad(cantidad);
		this.setPrecios(precios);
	}
	//Constructor solo con nombre y precio
	public Producto(String nombre, Double precios){
		this.nombre = nombre;
		this.precios = precios;
	}
	//Getter&Setters cantidad
	public Integer getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	//Getter&Setters nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Getter&Setters Precios
	public Double getPrecios() {
		return precios;
	}
	public void setPrecios(Double precios) {
		this.precios = precios;
	}
	
	

	
}
