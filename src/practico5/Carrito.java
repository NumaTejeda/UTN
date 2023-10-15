package practico5;

import entidades.Persona;

public class Carrito {
	
	private Persona Persona;
	private ItemCarrito item1;
	private ItemCarrito item2;
	private ItemCarrito item3;
	private Double precio;
	
	//Constructor 
	public Carrito(Persona persona, ItemCarrito item1, ItemCarrito item2, ItemCarrito item3) {
		this.Persona = persona;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	//Deberia retornar la suma del costo de los productos de carrito
	
	public String getPrecio() {
		return  "Cantidad // Producto // Precio Unitario \n" +
				"("+this.item1.getCantidad() +") "+ this.getItem1().getNombre()+" "+ this.getItem1().getPrecio()+"\n"+
				"("+this.item2.getCantidad() +") "+ this.getItem2().getNombre()+" "+ this.getItem2().getPrecio()+"\n"+
				"("+this.item3.getCantidad() +") "+ this.getItem3().getNombre()+" "+ this.getItem3().getPrecio()+
				"\nCosto total: "+this.setPrecio();
	}

	//Getter&Setter precio
	public Double setPrecio() {
		precio = item1.getPrecio()*item1.getCantidad() + item2.getPrecio()*item2.getCantidad() + item3.getPrecio()*item3.getCantidad();
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	//Getter&Setter Persona
	public Persona getPersona() {
		return Persona;
	}
	public void setPersona(Persona persona) {
		Persona = persona;
	}
	//Getter&Setter Item1
	public ItemCarrito getItem1() {
		return item1;
	}
	public void setItem1(ItemCarrito item1) {
		this.item1 = item1;
	}
	//Getter&Setter item2
	public ItemCarrito getItem2() {
		return item2;
	}
	public void setItem2(ItemCarrito item2) {
		this.item2 = item2;
	}
	//Getter&Setter Item3
	public ItemCarrito getItem3() {
		return item3;
	}
	public void setItem3(ItemCarrito item3) {
		this.item3 = item3;
	}

	
}	
