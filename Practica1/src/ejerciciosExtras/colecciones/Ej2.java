package ejerciciosExtras.colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ej2 {

	public static void main(String[] args) {
		List<Character> listChar = new ArrayList<Character>();
		List<Integer> listInteger = new ArrayList<Integer>();
		
		listChar.add('A');
		listChar.add('B');
		listChar.add('C');
		listChar.add('D');
		listChar.add('E');
		listChar.add('F');
		listChar.add('G');
		listChar.add('H');
		listChar.add('I');
		listChar.add('J');
		listChar.add('K');
		listChar.add('L');
		listChar.add('M');
		listChar.add('N');
		listChar.add('O');
		listChar.add('P');
		listChar.add('Q');
		listChar.add('R');
		
		rellenaIntList(listInteger);


		binarySearch(listChar, 'R');
		binarySearch(listInteger, 501);
	}

	private static <E> void binarySearch(List<E> list, E valor) {
		int minimo = 0;
		int maximo = list.size()-1;
		int posicion = 0;
		E result = null;
		if(list.get(maximo).equals(valor)) {
			result = list.get(maximo);
			posicion = maximo;
			minimo = maximo;
		}
		while (minimo < maximo) {
			posicion = (minimo + maximo) / 2;
			E valorPos = (E) list.get(posicion);
			@SuppressWarnings("unchecked")
			Comparator<E> cNatural = (Comparator<E>) Comparator.naturalOrder();
			if (cNatural.compare(valor, valorPos) < 0) {
				maximo = posicion;
			} else if (cNatural.compare(valor, valorPos) > 0) {
				minimo = posicion;
			} /*else if(posicion + 1 == maximo) {
				posicion = maximo;			
			}*/ else if(cNatural.compare(valor, valorPos) == 0) {
				break;
			}
			
		}
		result = list.get(posicion);
		

		System.out.println("El resultado es: " + result);
		System.out.println("\n\nY SE ENCUENTRA EN LA POSICION: " + posicion + "\n");

	}
	
	private static void rellenaIntList(List<Integer> list) {
		for(int i = 0; i<500; i++) {
			Integer num = i+2;
			list.add(num);
		}
	}
	
}
