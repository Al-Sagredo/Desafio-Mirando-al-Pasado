package cl.desafiolatam;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//12.
		Map<String, Integer> golosinas = new TreeMap<String, Integer>();
		//13. 
		golosinas.put("Chocman", 100);
		golosinas.put("Trululú", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tabletón", 5);
		
		//14.
		golosinas.entrySet().stream().filter(precio -> precio.getValue()<100).forEach(System.out::println);
	}

}
