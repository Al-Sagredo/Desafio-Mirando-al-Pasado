package cl.desafiolatam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 8.
		Set<String> invitados = new TreeSet<String>();
		// 9.
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		//10.
		List<String> posiblesInvitados = new ArrayList<String>(Arrays.asList("Jorge", "Francisco", "Marcos"));
		invitados.addAll(posiblesInvitados);
		System.out.println(invitados);
		//11. 
		invitados.remove("Jorge");
		System.out.println(invitados);
	}
}
