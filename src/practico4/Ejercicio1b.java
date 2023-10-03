package practico4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1b {

		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el primer numero: ");
			Integer num1 = sc.nextInt();
			
			System.out.println("Introduce el segundo numero: ");
			Integer num2 = sc.nextInt();
			
			System.out.println("Introduce el tercer numero: ");
			Integer num3 = sc.nextInt();
			
			System.out.println("Escribri (A) para ascendente ó (D) para descendente: ");
			String orden = sc.next().toUpperCase();
			
			
			
			if(orden.equals("A")) {
				ordenAsc(num1, num2, num3);
			}
			else {
				ordenDesc(num1, num2, num3);
			}
			sc.close();
			
		}
		
		// Funcion que ordena ascendentemente
		public static void ordenAsc(Integer a, Integer b, Integer c){
			
			Integer arrNum[] = {a, b, c};
			Arrays.sort(arrNum);
			for(int e : arrNum) {
				System.out.println(e);
			}
		}
		// Funcion que ordena descendentemente
		public static void ordenDesc(Integer a, Integer b, Integer c) {
			
			Integer arrNum[] = {a, b, c};
			Arrays.sort(arrNum, Collections.reverseOrder());
			for(int e : arrNum) {
				System.out.println(e);
			}
		}
		

}


