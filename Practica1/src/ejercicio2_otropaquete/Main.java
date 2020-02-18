package ejercicio2_otropaquete;

import ejercicio2.ManagerImpl;

public class Main {

	public static void main(String[] args) {

		OtroManagerImpl otroManager = new OtroManagerImpl();
		ManagerImpl manager = new ManagerImpl();
		
		manager.procesar();
		
		System.out.println(otroManager.procesar("HOLA OESÍA"));
		
		int i = 25;
		System.out.println("El cuadrado de " + i + " es: " + otroManager.devolverCuadrado(i));
	}

}
