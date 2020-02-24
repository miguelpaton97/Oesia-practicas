package com.ejemplos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OperacionesTest {

    @Test
    public void sumaTestOK() {

	final OperacionesAritmeticasImpl operacion = new OperacionesAritmeticasImpl();
	final int res = operacion.suma(4, 3);
	assertEquals(7, res);

    }

    @Test
    public void sumaTestKO() {

	final OperacionesAritmeticasImpl operacion = new OperacionesAritmeticasImpl();
	final int res = operacion.suma(4, 3);
	assertNotEquals(10, res);

    }

    @Test
    public void isNumeroPrimoOK() {

	final OperacionesAritmeticasImpl operacion = new OperacionesAritmeticasImpl();
	final Boolean primo = operacion.isNumeroPrimo(14);
	assertFalse(primo);

    }

    @Test
    public void isNumeroPrimoKO() {

	final OperacionesAritmeticas operacion = new OperacionesAritmeticasImpl();
	final Boolean primo = operacion.isNumeroPrimo(13);
	assertTrue(primo);

    }

}
