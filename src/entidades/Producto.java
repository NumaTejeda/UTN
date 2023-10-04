package entidades;

import java.time.LocalDate;

public class Producto {

	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private Integer pesoKg;
	private Double precios;
	
	private static final Double minPrecio = 0.1;
	
	public Producto(String nombre, String descripcion, Double precios) {
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setPrecios(precios);
	}
	
	public Producto(String nombre) {
		this.nombre = nombre;
		this.fechaAlta = LocalDate.now();
		this.precios = minPrecio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(Integer pesoKg) {
		this.pesoKg = pesoKg;
	}

	public Double getPrecios() {
		return precios;
	}

	public void setPrecios(Double precios) {
		this.precios = precios;
	}
	
	

	
}
