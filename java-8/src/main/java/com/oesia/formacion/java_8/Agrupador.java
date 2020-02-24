package com.oesia.formacion.java_8;

import java.util.List;
import java.util.stream.Collectors;

public interface Agrupador {

	void add(Object elemento);

	int numeroElementos();

	default void addAll(List<Object> lista) {
		for (Object object : lista) {
			this.add(object);
		}
	}

	default void addAllStream(List<Object> lista) {
		lista.stream().forEach(object -> this.add(object));
	}

}
