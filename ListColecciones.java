package test;

import java.util.ArrayList;
import java.util.List;

public class ListColecciones {
	public static void main(String[] args) {
		//List es una interface, ArrayList es la clase que implementa la interfaz.
		List miLista = new ArrayList();
		// Una lista va ser similar a un array en donde vamos agregar varios elementos.
		// con add podemos agregar cualquier tipo de objeto
		
		//miLista.add("Miguel");
		// miLista.add(15);
		
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		
		// mantiene el orden en que se van agregando los elementos
		// NO HAY RESTRICCION PODEMOS AGREGAR TODOS LOS ELEMENTOS QUE DESEEMOS
		// Un set no mantiene el orden de los elementos.
		
		/* for(Object elemento: miLista) {
			System.out.println("elemento = " + elemento);
		} */
		
		// FUNCIONES LAMBDA
		
		miLista.forEach(elemento -> {
			System.out.println("elemento = " + elemento);
		});
		
		
		 // Create a list of parts.
        // List<Part> parts = new List<Part>();
	}
}
