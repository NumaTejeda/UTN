package practico1;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String continuar = "si";
		
		while(continuar.equals("si")) {
			
			System.out.println("Ingresos totales del hogar por mes?");
			double ingresosMensuales = sc.nextDouble();
			
			System.out.println("Cuantos vehiculos posee con menos de 5 años de antigüedad?");
			int vehiculos = sc.nextInt();
			
			System.out.println("Cuantos imuebles posee?");
			int inmuebles = sc.nextInt();
			
			System.out.println("Posee una embarcación, una aeronave de lujo o es titular de activos\r\n"
					+ "societarios? Responda por (Si) o por (No)");
			String activos = sc.next().toLowerCase();

			if(ingresosMensuales >= 489083 ||vehiculos >= 3 || inmuebles >= 3 || activos.equals("si")){
				System.out.println("Usted pertenece al segmento de ingresos altos");
			}
			else {
				System.out.println("Usted no pertenece al segmento de ingresos altos");
			}
			System.out.println("Desea haer otra consulta? (Si) o (No).");
			continuar = sc.next().toLowerCase();
		}
		
		sc.close();

	}

}
