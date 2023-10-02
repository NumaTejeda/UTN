package practico4;

public class Promedio {

	public static void main(String[] args) {
		
		int arrayNum[] = {-4, 4, 3};
		System.out.println(promedio(arrayNum));
	}
	//Cuando una funcion no retorna nada ponemos void como en el main arriba
	
	public static int sumatoria(int[] numeros) {
		
		int resultado = 0;
		for(int i = 0; i < numeros.length; i++) {
			resultado += numeros[i];
		}
		return resultado;
	}
	
	public static int promedio(int[] numeros) {
		return sumatoria(numeros)/3;
	}
	
}
