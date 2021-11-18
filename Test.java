package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		List miLista = new ArrayList();
		// Una lista va ser similar a un array en donde vamos agregar varios elementos.
		// con add podemos agregar cualquier tipo de objeto

		// miLista.add("Miguel");
		// miLista.add(15);

		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		imprimir(miLista);
		
		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		imprimir(miSet);
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

// El set es mas rapido para acceder a los elementos por que no conserva el orden

// En lista si se pueden duplicar elementos
// EN Set no se pueden duplicar elementos
