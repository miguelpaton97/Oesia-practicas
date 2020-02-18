package ejercicio6.genericos;

import java.util.ArrayList;
import java.util.List;

public class Caja<E> {

	private List<E> contenidos;
	private final Integer tama�o;

	public Caja(Integer tama�o) {
		this.contenidos = new ArrayList<>();
		this.tama�o = tama�o;
	}

	public Integer getTama�o() {
		return this.tama�o;
	}

	public List<E> getContenidos() {
		return this.contenidos;
	}

	public void add(E elemento) {
		if (contenidos.size() < tama�o) {
			this.contenidos.add(elemento);
		} else {
			System.out.println("No es posible a�adir m�s de " + tama�o + "elementos en la caja");
		}
	}

	@Override
	public String toString() {
		return "Caja [contenidos=" + contenidos + ", tama�o=" + tama�o + "]";
	}

}
