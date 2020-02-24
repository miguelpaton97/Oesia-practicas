package com.oesia.formacion.maven_srv;

import com.oesia.formacion.maven_model.Articulo;

public class FacadeArticulo {

	public String getInfo(Articulo articulo) {
		String res = articulo.toString();
		return res;
		
	}
}
