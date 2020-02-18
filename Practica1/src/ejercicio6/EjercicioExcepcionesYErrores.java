package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class EjercicioExcepcionesYErrores {

	public static void main(String[] args) {

		System.out.println("-------Crea Lista-------\n");
		creaLista();
		System.out.println("\n-------Recorre Lista-------\n");
		recorreLista();

	}

	private static void creaLista() {
		List<String> listaVacia = null;

		try {
			listaVacia.add("hola");
		} catch (NullPointerException exception) {
			System.out.println("La lista no esta instanciada\n" + "Error ---> " + exception.getMessage());
		}

	}

	private static void recorreLista() {
		List<String> listaInstanciada = new ArrayList<String>();
		listaInstanciada.add("hola");
		try {
			iteradorLista(listaInstanciada);
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("No es posible salirse fuera de la lista: \n" + exception.getMessage());
		}
	}

	private static void iteradorLista(List<String> lista) throws IndexOutOfBoundsException {
		
		try {
			for (int i = 0; i < 3; i++) {
				lista.get(i);
			}
		} catch (IndexOutOfBoundsException exception) {
			throw exception;
		} 

	}

}
