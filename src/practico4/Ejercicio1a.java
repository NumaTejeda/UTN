package practico4;

import java.util.Arrays;
import java.util.Collections;

public class Ejercicio1a {

	public static void main(String[] args) {
		
		
		int num1 = 1;
		int num2 = 2;
		int num3 = -3;
		
		String orden = "D";
		
		if(orden.equals("A")) {
			ordenAsc(num1, num2, num3);
		}
		else {
			ordenDesc(num1, num2, num3);
		}
		
	}
	
	// Funcion que ordena as
	public static void ordenAsc(int a, int b, int c){
		
		Integer arrNum[] = {a, b, c};
		Arrays.sort(arrNum);
		for(int e : arrNum) {
			System.out.println(e);
		}
	}
	public static void ordenDesc(int a, int b, int c) {
		
		Integer arrNum[] = {a, b, c};
		Arrays.sort(arrNum, Collections.reverseOrder());
		for(int e : arrNum) {
			System.out.println(e);
		}
	}

}
