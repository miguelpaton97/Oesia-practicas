package com.oesia.formacion.maven_gui;

import com.oesia.formacion.maven_model.Articulo;
import com.oesia.formacion.maven_srv.FacadeArticulo;

public class ArticuloForm {
	
	private FacadeArticulo facadeArticulo;
	
	public void showArticleInfo() {
		Articulo articulo = new Articulo();
		int numero = (int) (Math.random() * 1000000000 + 1);
		articulo.setId(numero);
		articulo.setTipoArticulo("Camiseta");
		System.out.println(facadeArticulo.getInfo(articulo));
	}
	
	public ArticuloForm(FacadeArticulo facadeArticulo) {
		super();
		this.facadeArticulo = facadeArticulo;
	}

}
