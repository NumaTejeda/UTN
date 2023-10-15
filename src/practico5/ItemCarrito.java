package practico5;
import entidades.Producto;

public class ItemCarrito extends Producto{
	
	private Integer cantidad;
	
	//Constructo completo
	public ItemCarrito(String nombre, Integer stock, Double precio, Integer cantidad) {
		super(nombre, stock, precio);
		this.setCantidad(cantidad);
	}
	//Constructor simple
	public ItemCarrito(String nombre, Double precio, Integer cantidad) {
		super(nombre, precio);
		this.setCantidad(cantidad);
	}
	
	public String toString() {
		return "Producto: " + this.getNombre() + ", Cantidad: "+ this.getCantidad() + ", Precio: "+this.getPrecio();
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
