package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		// Map<K, V>
		// map no hereda de la interface collection por eso no utiliza el add
		Map miMapa = new HashMap();
		miMapa.put("valor1", "Juan");
		miMapa.put("valor2", "Karla");
		miMapa.put("valor3", "Rosario");
		
		String elemento = (String) miMapa.get("valor1");
		// System.out.println("elemento = " + elemento);
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
	}
	
	public static void imprimir(Collection coleccion) {
		/*
		 * for(Object elemento: coleccion) { System.out.println("elemento = " +
		 * elemento); }
		 */
		coleccion.forEach(elemento -> {
			System.out.println("elemento = " + elemento);
		});
	}
}
