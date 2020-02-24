package com.oesia.formacion.maven_model;

public class Articulo {

	private int id;
	private String tipoArticulo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoArticulo() {
		return tipoArticulo;
	}

	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}

	@Override
	public String toString() {
		return "Articulo [id = " + id + ", tipoArticulo = " + tipoArticulo + "]";
	}

}
