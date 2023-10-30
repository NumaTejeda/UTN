package Clase9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CreandoListas {
	
	public static void main(String[] args) {
		
		//Coleccion TIPO ArrayList
		List<Integer> listaDeNumeros = new ArrayList<Integer>();
		listaDeNumeros.add(1);
		listaDeNumeros.add(5);
		listaDeNumeros.add(10);
		listaDeNumeros.add(15);
		
		System.out.println(listaDeNumeros);
		
		//Por posicion
		listaDeNumeros.remove(1);
		
		List<String> listaDePalabras = new ArrayList<String>();
		
		listaDePalabras.add("Nicolas");
		listaDePalabras.add("Leonardo");
		listaDePalabras.add("Numa");
		listaDePalabras.add("Tejeda");
		
		listaDePalabras.remove("Leonardo");
		
		System.out.println(listaDePalabras);
		
		//Coleccion tipo hashMap, es como un JSON Map<key : valor>
		Map<Integer, String> ejemploASCII =  new HashMap<Integer, String>();
		
		ejemploASCII.put(97, "a");
		ejemploASCII.put(98, "b");
		
		System.out.println(ejemploASCII);
		
		System.out.println("Sobrescrito");
		ejemploASCII.put(97, "c");
		System.out.println(ejemploASCII);
		
		System.out.println("Imprimir por clave");
		System.out.println(ejemploASCII.get(98));
		
		Map<String, Integer> edadDePersonas = new HashMap<String, Integer>();
		edadDePersonas.put("Numa", 35);
		
		System.out.println(edadDePersonas.containsKey("Numa"));
		
		//Coleccion tipo HashSet no permite que haya elementos iguales
		
		Set<String> lenguajes = new HashSet<String>();
		
		lenguajes.add("A");
		lenguajes.add("BB");
		lenguajes.add("JavaScript");
		lenguajes.add("JAVA");
		lenguajes.add("Pyhton");
		 System.out.println(lenguajes);
		
		
		
		
	}
}
