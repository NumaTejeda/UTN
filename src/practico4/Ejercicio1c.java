package practico4;


public class Ejercicio1c {
	public static void main(String[] args) {
		System.out.println("Con parametros: ");
		bifurcacion(4, 5, 10, "D");
		System.out.println("Sin parametros: ");
		bifurcacion(null, null, null, null);
	}
	public static void bifurcacion(Integer a, Integer b, Integer c, String respuesta) {
		
		if( (a == null)||(b == null) || (c == null)) {
			Ejercicio1a.main(null);  
		}
		else {
			if(respuesta.equals("A")) {
				System.out.println("--Ascendente--");
				Ejercicio1b.ordenAsc(a, b, c);				
			}
			else {
				System.out.println("--Descendente--");
				Ejercicio1b.ordenDesc(a, b, c);
			}
		}
		
	}
}
