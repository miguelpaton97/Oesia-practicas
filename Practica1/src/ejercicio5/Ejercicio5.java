package ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ejercicio = sc.nextInt();
		
		switch (ejercicio) {
		case 1:
			EjercicioListas();
			break;
		case 2:
			EjercicioMapas();
			break;
		case 3:
			RecorreMapas();
			break;
		default:
			break;
		}
		sc.close();

	}

	private static void EjercicioListas() {
		System.out.println("1er apartado --->\n");
		List<String> ejemplo = Arrays.asList("Sevilla", "Cádiz", "Huelva", "Córdoba");
		List<String> ciudades = new ArrayList<String>();
		ciudades.addAll(ejemplo);
		for (String ciudad : ciudades) {
			System.out.println(ciudad);
		}

		System.out.println("\n2º apartado --->\n");

		Boolean contieneHola = ciudades.contains("hola");
		if (contieneHola) {
			System.out.println("Esta lista si contiene la palabra 'hola'");
		} else {
			System.out.println("Esta lista no contiene la palabra 'hola'");
		}

		System.out.println("\n3er apartado --->\n");

		List<String> otrosEjemplos = Arrays.asList("Jaén", "Granada");
		List<String> otrasCiudades = new ArrayList<String>();
		otrasCiudades.addAll(otrosEjemplos);
		ciudades.addAll(otrasCiudades);

		System.out.println("...primer recorrido...\n");

		for (String ciudad : ciudades) {
			System.out.println(ciudad);
		}

		System.out.println("\n...segundo recorrido...\n");

		Iterator<String> iterator = ciudades.iterator();
		while (iterator.hasNext()) {
			String ciudad = iterator.next();
			System.out.println(ciudad);
		}

		System.out.println("\n4º apartado --->\n");
		otrasCiudades.clear();
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(3);
		numeros.add(15);
		numeros.add(465);
		numeros.add(45365657);
//		otrasCiudades.addAll(numeros)

		Set<Integer> listaNoRepetida = new LinkedHashSet<Integer>();
		listaNoRepetida.add(455);
		listaNoRepetida.add(3);
		listaNoRepetida.add(55);
		listaNoRepetida.add(100);
		listaNoRepetida.add(981);
		listaNoRepetida.add(455);
		for (Integer num : listaNoRepetida) {
			System.out.println("" + num);
		}

		System.out.println("\n5º apartado --->\n");
		String texto = "Java";
		otrasCiudades.add(texto);
		texto = "modificacion";
		System.out.println("Elementos dentro de la lista:");
		for (String t : otrasCiudades) {
			System.out.println(t);
		}

		System.out.println("\n6º apartado --->\n");
		Integer secuencia = 57;
		numeros.add(secuencia);
		secuencia = 86;
		System.out.println("Elementos dentro de la lista:");
		for (Integer n : numeros) {
			System.out.println(n);
		}

		System.out.println("\n7º apartado --->\n");
		List<Ropa> almacen = new ArrayList<Ropa>();
		Ropa prenda = new Ropa(40);
		almacen.add(prenda);
		System.out.println("Tallas de la ropa que contiene la lista:");
		for (Ropa r : almacen) {
			Integer talla = r.getTalla();
			System.out.println(talla);
		}

		System.out.println("\nTallas de la ropa que contiene la lista tras modificación:");
		prenda.setTalla(44);
		for (Ropa r : almacen) {
			Integer talla = r.getTalla();
			System.out.println(talla);

		}
	}

	private static void EjercicioMapas() {

		Map<String, String> palabras = new HashMap<String, String>();
		palabras.put("hola", "hello");
		palabras.put("adios", "good bye");
		palabras.put("silla", "chair");
		palabras.put("mesa", "table");
		palabras.put("ordenador", "computer");
		palabras.put("coche", "car");
		palabras.put("bicicleta", "bicicle");
		palabras.put("suelo", "floor");
		palabras.put("gafas", "glasses");
		palabras.put("anillo", "ring");
		palabras.put("reloj", "watch");
		palabras.put("libro", "book");
		palabras.put("agua", "water");
		palabras.put("aceite", "oil");
		palabras.put("camiseta", "t-shirt");

		System.out.println("Ingrese aqui la palabra que desee traducir: ");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.next();
		sc.close();
		if (!palabras.containsKey(palabra)) {
			System.out.println("Esa palabra no esta traducida en el sistema");
		} else {
			System.out.println("\nTraducción de la palabra ingresada");
			System.out.println(palabras.get(palabra));
		}

	}
	
	private static void RecorreMapas() {
		Map<String, String> palabras = new HashMap<String, String>();
		palabras.put("hola", "hello");
		palabras.put("adios", "good bye");
		palabras.put("silla", "chair");
		palabras.put("mesa", "table");
		palabras.put("ordenador", "computer");
		palabras.put("coche", "car");
		palabras.put("bicicleta", "bicicle");
		palabras.put("suelo", "floor");
		palabras.put("gafas", "glasses");
		palabras.put("anillo", "ring");
		palabras.put("reloj", "watch");
		palabras.put("libro", "book");
		palabras.put("agua", "water");
		palabras.put("aceite", "oil");
		palabras.put("camiseta", "t-shirt");
		
		System.out.println("Mostrando todas las palabras en ES: ");
		
		for(String palabra: palabras.keySet()) {
			System.out.println(palabra);
		}
		
		System.out.println("\nMostrando todas las palabras en EN: ");
		for(String palabra: palabras.values()) {
			System.out.println(palabra);
		}
		
		System.out.println("\nMostrando todas las palabras junto a su traduccion: ");
		for(String palabra: palabras.keySet()) {
			System.out.println(palabra + " ---> " + palabras.get(palabra));
		}
		
	}

}
