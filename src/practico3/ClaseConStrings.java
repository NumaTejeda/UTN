package practico3;

public class ClaseConStrings {

	public static void main(String[] args) {
		
		String txt = "Hola Mundo";
		System.out.println(txt);
		
		//Podemos interpretar a la clase String como un array de char pero no estatico
		
		char data[] = {'a', 'b', 'c'};
		String dataString = new String(data);
		System.out.println(data);
		dataString = "Numa";
		System.out.println(dataString);
		
		if(dataString.endsWith("js")){
			System.out.println("True!");
		}
		
		
		for(String letra : dataString.split("")) {
			System.out.println(letra);
		}
		String dosLineas = "Esto es un salto \n de linea";
		System.out.println(dosLineas);
		
		String sub = dataString.substring(0, 4);
		System.out.println(sub + " Soy un \" substring");
		
		byte[] code = dosLineas.getBytes();
		for(byte letra : code) {
			System.out.println(letra);
		}
	}

}
