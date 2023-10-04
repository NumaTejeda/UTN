package practico4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacion = sc.next();
        String rutaArchivo = "recursos/ejercicio2.txt";
         try {
			sumarNumerosEnArchivo(rutaArchivo, operacion);
		} catch (IOException e) {
			e.printStackTrace();
		}
            
         sc.close();
        
	}
    public static void sumarNumerosEnArchivo(String ruta, String operacion) throws IOException {

        Path pathDelArchivo = Paths.get(ruta);
        List<String> lineas = Files.readAllLines(pathDelArchivo);
        int resultado = (operacion.equals("s")) ? 0 : 1;
        
  

        for (String linea : lineas) {
            try {
                Integer numero = Integer.parseInt(linea);
                if (operacion.equals("s")) {
                    resultado += numero; 
                } else if (operacion.equals("m")) {
                    resultado *= numero;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error al convertir una línea a número: " + linea);
            }
        }

        System.out.println(resultado);
    }


}
