package cl.desafiolatam;

import java.util.ArrayList;
import java.util.Arrays;


public class Ejercicio1 {
	
	public static void main(String[] args) {
		//1.
		ArrayList<String> marcas = new ArrayList<String>();
		//2.
		marcas.add("Marmontini");
		marcas.add("Pepsi");
		marcas.add("Quatro");
		marcas.add("Icarito");
		marcas.add("Nova");
		marcas.add("Abolengo");
		marcas.add("Agorex");
		marcas.add("Costa");
		marcas.add("Nestl�");
		marcas.add("IBM");
		System.out.println(marcas);
		//3.
		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		System.out.println(marcas);
		//4.
		marcas.set(10, "BlockBuster");
		System.out.println(marcas);
		//5.
		System.out.println("La marca est� en la lista: " + marcas.remove("Carrefour"));
		marcas.remove(11);
		System.out.println(marcas);
		System.out.println("La marca est� en la lista: " + marcas.remove("Carrefour"));
		
		//6.
		
		ArrayList<String> posiblesMarcas = new ArrayList<String>(Arrays.asList("Coca-Cola","Puma", "Playboy"));
		marcas.addAll(posiblesMarcas);
		System.out.println("Tama�o lista actualizada: " + marcas.size());

		
	}
	
	

}
