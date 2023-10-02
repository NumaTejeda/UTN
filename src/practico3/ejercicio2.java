package practico3;
import java.util.Scanner;



// El ejercicio quedo hecho para cualquier cantidad que quiera sumarle

public class ejercicio2 {

	public static void main(String[] args) {
		
			
		
		String texto = "Nicolas Leonardo Numa Tejeda";
		
		byte[] arrBytes = texto.getBytes(); // gtetBytes codifica y devuelve un array de bytes (unicode)
		System.out.println(new String(arrBytes)); //Decodifica
		
		System.out.println("Introduzca un numero de desplazamiento: ");
		Scanner sc = new Scanner(System.in);
		byte opcion = sc.nextByte();
		
		for(int i = 0; i< arrBytes.length; i++) {       
			
			arrBytes[i] =(byte) (arrBytes[i] + opcion); // Este codigo fue sugerido por Eclipse, ya que estaba teniendo un
														// problema con la conversion de tipo de datos.
														//"(byte)" indica que el resultado entre parentesis debe ser tratado como bytes
		}
		String nuevo = new String(arrBytes);
		System.out.println(nuevo);
		sc.close();
	}

}
