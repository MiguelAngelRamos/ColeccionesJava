package test;

import java.util.HashSet;
import java.util.Set;

public class SetColecciones {
	public static void main(String[] args) {
		// en Set no se respeta el orden que fueron agregados los elementos
		// Set<E> miSet  = new HashSet<E>();
		 Set miSet  = new HashSet();
		 miSet.add("Lunes");
		 miSet.add("Martes");
		 miSet.add("Miercoles");
		 miSet.add("Jueves");
		 miSet.add("Viernes");
		 
		 
		 miSet.forEach(elemento -> {
				System.out.println("elemento = " + elemento);
			});
	}
}
