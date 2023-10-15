package practico5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import entidades.Persona;
import entidades.Producto;

public class TrabajandoConClases {
	public static void main(String[] args) {
		
		String rutaRelativa = "recursos/items.txt";
		Path archivoPath = Paths.get(rutaRelativa);
		
		
		List<Producto> productos = new ArrayList<>();
		try {
            List<String> lineas = Files.readAllLines(archivoPath);

            int productosCreados = 0;

            for (String linea : lineas) {
                if (productosCreados >= 3) {
                    break; // Sale del bucle 
                }
                // Se crea una lista de Objetos de la clase Producto a partir del archivo
                String[] partes = linea.split(" ");
                if (partes.length == 2) {
                    String nombre = partes[0];
                    Double precio = Double.parseDouble(partes[1]);

                    Producto producto = new Producto(nombre, precio);
                    productos.add(producto);
                    productosCreados++;
                }
            }
		} catch (IOException e) {
            e.printStackTrace();
        }
    
		
		
		Persona numa = new Persona("Numa", "Tejeda");
		System.out.println("Carrito de: "+numa.toString());
		/*for (Producto producto : productos) {
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Precio: " + producto.getPrecios());
			System.out.println("---------------------------");
		}*/
		
		/*Producto harina = new Producto("Harina", 2, 2000.0);
		Producto roastBeef = new Producto("RoastBeef", 3, 5000.0);
		Producto leche = new Producto("Leche", 4, 1000.0);*/
		
		// Instancia un carrito
		Producto producto1 = productos.get(0);
		Producto producto2 = productos.get(1);
		Producto producto3 = productos.get(2);
		producto1.setStock(3);
		producto2.setStock(7);
		producto3.setStock(10);
		
		ItemCarrito item1 = new ItemCarrito(producto1.getNombre(), producto1.getPrecio(), 3);
		ItemCarrito item2 = new ItemCarrito(producto2.getNombre(), producto2.getPrecio(), 4);
		ItemCarrito item3 = new ItemCarrito(producto3.getNombre(), producto3.getPrecio(), 2);
		
		Carrito carrito = new Carrito(numa, item1, item2, item3);
		
		System.out.println(carrito.getPrecio());
		System.out.println(item1.toString());
		System.out.println(producto1.toStrring());
		
	}
}
