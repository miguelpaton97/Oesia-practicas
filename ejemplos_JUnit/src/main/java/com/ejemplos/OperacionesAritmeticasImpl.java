package com.ejemplos;

public class OperacionesAritmeticasImpl implements OperacionesAritmeticas{
	
	/*
	 * Método para obtener la suma de dos elementos.	
	 */
	public int suma(int x, int y){
		int result = 0;
		result = x + y;
		return result;		
	}

	/*
	 * Metodo que determina si un numero es primo
	 */
	public Boolean isNumeroPrimo(int num) {
	    boolean primo = true; 
	    for(int i = 2; i < num; i++) {
	        if (num % i == 0) {
	        	primo = false;
	            break;
	        }
	    }
	    return primo;
	}
}
