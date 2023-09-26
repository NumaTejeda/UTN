package practico3;

public class ClaseConArrays {

	public static void main(String[] args) {
		// declaro el tipo // creo el array
		int numeros[] = new int[3];
		
		numeros[0] = 1;
		numeros[1] = 10;
		
		//Java agrega valor 0 por default
		System.out.println(numeros[2]);
		
		// Otra forma de asiganar valores
		int arrayNumeros [] = {1, 23, 35, 16};
		
		//Otra forma más que no cambia mas que solo la sintaxis respecto a la enterior
		int otro[] = new int[] {1, 45,48};
		
		System.out.println("Cantidad de elementos: " + otro.length);
		
		for(int i = 0; i < otro.length; i++) {
			System.out.println("El elemento en la posicion " + (i+1) + " es: " +otro[i]);
		}
	}

}
