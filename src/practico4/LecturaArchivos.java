package practico4;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class LecturaArchivos {

	public static void main(String[] args) throws IOException {
			
		//String rutaAbsoluta = "C:/Desktop/utn/neoris_utn/utn/recursos.txt";
		String rutaRelativa = "recursos/archivoTexto.txt";
		
		Path pathDelArchivo = Paths.get(rutaRelativa);
		try {
			for(String linea : Files.readAllLines(pathDelArchivo)) {
				System.out.println(linea);
				// metodo de reescribir
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
