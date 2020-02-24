package com.oesia.formacion.java_8;

public class AgrupadorConArray implements Agrupador {

	private Object[] contenido = new Object[20];
	private int index = 0;

	public void add(Object elemento) {
		contenido[index++] = elemento;
	}

	public int numeroElementos() {
		return index;
	}

}
