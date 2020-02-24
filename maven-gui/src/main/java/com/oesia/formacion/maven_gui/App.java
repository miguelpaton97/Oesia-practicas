package com.oesia.formacion.maven_gui;

import com.oesia.formacion.maven_srv.FacadeArticulo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        FacadeArticulo facadeArticulo = new FacadeArticulo();
		ArticuloForm articuloForm = new ArticuloForm(facadeArticulo);
		articuloForm.showArticleInfo();
    }
}
