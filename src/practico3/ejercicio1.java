package practico3;

import java.util.Arrays;
import java.util.Collections;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "nicolas leonardo numa tejeda";
		
		char letra = 'n';
		int cantidad= 0;
		
		for(int i = 0; i < string.length(); i++ ) {
			
			if(string.charAt(i) == letra) {
				cantidad++;
			}
			
		}
		System.out.println("La cantidad de veces que aparece "+letra+" es: "+cantidad);
		
		// Activadad 1.b
		
		Integer numeros[] = {10, -48, 75};
		boolean asc = true;
		
		System.out.println("Ordenado");
		if(asc) {
			Arrays.sort(numeros); // El metodo Sort ordena de manera ascendente por default
		}
		else {
			Arrays.sort(numeros, Collections.reverseOrder()); 	// descendente
		}
		for(int e : numeros) {
			System.out.println(e);
		}
		
		//Actividad 1.c
		
		int vectorNumeros[] = {10, 20, 30};
		int sumaDeNumeros = 0;
		int x = 10;
		
		for(int num : vectorNumeros) {
			if(num > x) {
				sumaDeNumeros = sumaDeNumeros + num;
			}
		}
		System.out.println("Resultado suma: "+ sumaDeNumeros);
		
	}

}
