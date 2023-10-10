package practico5
import entidades.Persona;
import entidades.Producto;

public class ItemCarrito extends Carrito{
	
	public ItemCarrito(entidades.Persona persona, Producto producto1, Producto producto2, Producto producto3) {
		super(persona, producto1, producto2, producto3);
	}
	
	private Producto item1 = getProducto1();
	private Producto item2 = getProducto2();
	private Producto item3 = getProducto3();
	private Integer cantidad;
	private Double precioUnitario;
	
	
	public Producto getItem1() {
		return item1;
	}
	public void setItem1(Producto item1) {
		this.item1 = getProducto1();
	}
	public Producto getItem2() {
		return item2;
	}
	public void setItem2(Producto item2) {
		this.item2 = item2;
	}
	public Producto getItem3() {
		return item3;
	}
	public void setItem3(Producto item3) {
		this.item3 = item3;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
}
