package com.oesia.formacion.java_8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class TestAgrupador {

	/**
	 * Completad la definicion de la clase AgrupadorConList 
	 * para que implemente la interface
	 * (este ejercicio es de repaso, no usa los metodos default)
	 */
	@Test
	public void test_add() {
		
		Agrupador agrupador = new AgrupadorConList();
		Assert.assertEquals(0, agrupador.numeroElementos());
		
		agrupador.add("primero");
		Assert.assertEquals(1, agrupador.numeroElementos());
		
	}
	
	
	/**
	 * definid un metodo default addAll que acepte un Collection y
	 * a�ada cada objeto al agrupador
	 * Cuando tengais el metodo, descomentad el codigo comentado en el test
	 */
	@Test
	public void test_addAllList() {
		
		Agrupador agrupador = new AgrupadorConList();
		agrupador.addAll(Arrays.asList("primero","segundo"));
		
		Assert.assertEquals(2,agrupador.numeroElementos());
	}
	@Test
	public void test_addAllArray() {
		
		Agrupador agrupadorArray = new AgrupadorConArray();
		agrupadorArray.addAll(Arrays.asList("primero","segundo"));
		
		Assert.assertEquals(2,agrupadorArray.numeroElementos());
	}
	@Test
	public void test_addAllListStream() {
		
		Agrupador agrupador = new AgrupadorConList();
		agrupador.addAllStream(Arrays.asList("primero","segundo"));
		
		Assert.assertEquals(2,agrupador.numeroElementos());
	}
	@Test
	public void test_addAllArrayStream() {
		
		Agrupador agrupadorArray = new AgrupadorConArray();
		agrupadorArray.addAllStream(Arrays.asList("primero","segundo"));
		
		Assert.assertEquals(2,agrupadorArray.numeroElementos());
	}
}
