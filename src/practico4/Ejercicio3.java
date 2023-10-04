package practico4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        //ENTRADAS DE ARGUMENTOS
        System.out.println("Ingrese 'codificar' o 'decodificar': ");
        String operacion = scanner.nextLine();

        System.out.println("Ingrese la ruta del archivo de entrada: ");
        String archivoEntrada = scanner.nextLine();

        System.out.println("Ingrese la ruta del archivo de salida: ");
        String archivoSalida = scanner.nextLine();

        System.out.println("Ingrese el número de desplazamiento: ");
        int desplazamiento = scanner.nextInt();

        try { // llama al metodo realizarOperacion y pasa los valores, guarda en un array de byte resultdo
            byte[] resultado = realizarOperacion(operacion, archivoEntrada, desplazamiento);
            Files.write(Paths.get(archivoSalida), resultado); // reescrive el archivo de salida con lo que hay dentro de resultado
            System.out.println("Operación completada con éxito.");
        } catch (IOException e) {
            System.err.println("Error al leer/escribir archivos: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en el argumento de desplazamiento: " + e.getMessage());
        }

        scanner.close();
    }
	//devuleve array de byte
    public static byte[] realizarOperacion(String operacion, String archivoEntrada, int desplazamiento) throws IOException {
        byte[] contenidoEntrada = Files.readAllBytes(Paths.get(archivoEntrada)); // lee el contenido del archivo de entrada  y lo guarda
        byte[] resultado = new byte[contenidoEntrada.length]; //crea un nuevo array de bytes del tamaño del array contenidoEntrada
        
        // segun el valor de operacion codifica(desplaza hacia la derecha) o decodifica(desplaza hacia la izquierda)
        for (int i = 0; i < contenidoEntrada.length; i++) { 
            if (operacion.equals("codificar")) {
                resultado[i] = (byte) (contenidoEntrada[i] + desplazamiento); //como desplazmaineto es tipo int necesita ser convertida la suma a byte.
            } else if (operacion.equals("decodificar")) {					// ser convertida la suma a byte para ser guardada en resultado[]
                resultado[i] = (byte) (contenidoEntrada[i] - desplazamiento);
            }
        }

        return resultado;
    }

}
