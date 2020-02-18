package ejercicio6.genericos;

import java.util.ArrayList;
import java.util.List;

public class Caja<E> {

	private List<E> contenidos;
	private final Integer tamaño;

	public Caja(Integer tamaño) {
		this.contenidos = new ArrayList<>();
		this.tamaño = tamaño;
	}

	public Integer getTamaño() {
		return this.tamaño;
	}

	public List<E> getContenidos() {
		return this.contenidos;
	}

	public void add(E elemento) {
		if (contenidos.size() < tamaño) {
			this.contenidos.add(elemento);
		} else {
			System.out.println("No es posible añadir más de " + tamaño + "elementos en la caja");
		}
	}

	@Override
	public String toString() {
		return "Caja [contenidos=" + contenidos + ", tamaño=" + tamaño + "]";
	}

}
