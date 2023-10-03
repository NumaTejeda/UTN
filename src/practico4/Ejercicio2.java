package practico4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {

        String rutaArchivo = "recursos/ejercicio2.txt";

         try {
			sumarNumerosEnArchivo(rutaArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
        
	}
    public static void sumarNumerosEnArchivo(String ruta) throws IOException {
        int suma = 0;

        Path pathDelArchivo = Paths.get(ruta);
        List<String> lineas = Files.readAllLines(pathDelArchivo);

        for (String linea : lineas) {
        	// TODO Auto-generated catch block
            try {
                Integer numero = Integer.parseInt(linea);
                suma += numero;
            } catch (NumberFormatException e) {
                System.err.println("Error al convertir una línea a número: " + linea);
            }
        }

        System.out.println(suma);
    }

}
