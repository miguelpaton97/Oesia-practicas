package com.oesia.formacion.java_8;

import java.util.ArrayList;
import java.util.List;

public class AgrupadorConList implements Agrupador {

	private List<Object> contenido = new ArrayList<>();

	public void add(Object elemento) {
		contenido.add(elemento);
	}

	public int numeroElementos() {
		return this.contenido.size();
	}

	// todo implementad los metodos de la interface usando la lista contenido

}
