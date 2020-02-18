package ejerciciosExtras.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ej1 {
	
	private static final int TAMAÑO_LISTA = 5000000;
	
	public static void main(String[] args) {
		
		diferenciaListas();
		
	}
	
	private static void diferenciaListas() {
		List<Integer> listaArray = new ArrayList<Integer>();
		List<Integer> listaLinked = new LinkedList<Integer>();
		
		rellenaListas(listaArray);
		rellenaListas(listaLinked);
		
		long mediaArray = 0;
		
		
		long initArray = System.nanoTime();
		System.out.print("Acceso a la ArrayList: ");
		System.out.println(listaArray.get((TAMAÑO_LISTA/2 - 1)));
		long finishArray = System.nanoTime();
		mediaArray += (finishArray - initArray);
		
		
		initArray = System.nanoTime();
		System.out.print("Acceso a la ArrayList: ");
		System.out.println(listaArray.get((TAMAÑO_LISTA/2 - 1)));
		finishArray = System.nanoTime();
		mediaArray += (finishArray - initArray);
		
		initArray = System.nanoTime();
		System.out.print("Acceso a la ArrayList: ");
		System.out.println(listaArray.get((TAMAÑO_LISTA/2 - 1)));
		finishArray = System.nanoTime();
		mediaArray += (finishArray - initArray);
		
		initArray = System.nanoTime();
		System.out.print("Acceso a la ArrayList: ");
		System.out.println(listaArray.get((TAMAÑO_LISTA/2 - 1)));
		finishArray = System.nanoTime();
		mediaArray += (finishArray - initArray);
		
		initArray = System.nanoTime();
		System.out.print("Acceso a la ArrayList: ");
		System.out.println(listaArray.get((TAMAÑO_LISTA/2 - 1)));
		finishArray = System.nanoTime();
		mediaArray += (finishArray - initArray);
		
		mediaArray = mediaArray/5;
		
		System.out.println("\nEl acceso a ArrayList ha tardado: " + (mediaArray));
		
		long mediaLinked = 0;
		
		long initLinked = System.nanoTime();
		System.out.print("\n\nAcceso a la LinkedList: ");
		System.out.println(listaLinked.get((TAMAÑO_LISTA/2 - 1)));
		long finishLinked = System.nanoTime();
		mediaLinked += (finishLinked - initLinked);
		
		initLinked = System.nanoTime();
		System.out.print("Acceso a la LinkedList: ");
		System.out.println(listaLinked.get((TAMAÑO_LISTA/2 - 1)));
		finishLinked = System.nanoTime();
		mediaLinked += (finishLinked - initLinked);
		
		initLinked = System.nanoTime();
		System.out.print("Acceso a la LinkedList: ");
		System.out.println(listaLinked.get((TAMAÑO_LISTA/2 - 1)));
		finishLinked = System.nanoTime();
		mediaLinked += (finishLinked - initLinked);
		
		initLinked = System.nanoTime();
		System.out.print("Acceso a la LinkedList: ");
		System.out.println(listaLinked.get((TAMAÑO_LISTA/2 - 1)));
		finishLinked = System.nanoTime();
		mediaLinked += (finishLinked - initLinked);
		
		initLinked = System.nanoTime();
		System.out.print("Acceso a la LinkedList: ");
		System.out.println(listaLinked.get((TAMAÑO_LISTA/2 - 1)));
		finishLinked = System.nanoTime();
		mediaLinked += (finishLinked - initLinked);
		
		mediaLinked = mediaLinked/5;
		System.out.println("\nEl acceso a LinkedList ha tardado: " + (mediaLinked));
		
	}
	
	private static void rellenaListas(List<Integer> lista) {
		for(int i = 0; i<TAMAÑO_LISTA; i++) {
			Integer num = (int) Math.floor(Math.random()*5000 + 1);
			lista.add(num);
		}
		
	}

}
