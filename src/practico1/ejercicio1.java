package practico1;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		// 1.a
		System.out.println("// Ejercicio 1.a");
		
		int a = 5;
		int b = 10;
		
		while(a <= b) {
			System.out.println(a);
			a++;
		}
		
		// 1.b
		System.out.println("// Ejercicio 1.b");
		
		a = 5;
		
		while(a <= b) {
			if(a%2 == 0) {
				System.out.println(a);
			}
			a++;
		}
		
		// 1.c
		System.out.println("// Ejercicio 1.c");
		
		a = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica p (par) o i (inpar)");
		String choise = sc.nextLine();

		while(a<=b) {
			
			if(a%2 == 0 && choise.equals("p")) {
				System.out.println(a);
				
			}
			else if(a%2 != 0 && choise.equals("i")){
				System.out.println(a);
				
			}
			a++;
		}
		sc.close();
		
		// 1.d
		System.out.println("Ejercicio 1.d");
		
		a = 0;
		for(int i = b; i >= a; i--) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
