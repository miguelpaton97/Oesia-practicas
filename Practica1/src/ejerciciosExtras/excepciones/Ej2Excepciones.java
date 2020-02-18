package ejerciciosExtras.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2Excepciones {

	public static void main(String[] args) throws MyException {

		programaDivision();

	}

	private static void programaDivision() {
		Boolean datosCorrectos = false;

		while (!datosCorrectos) {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.print("Introduzca 'a': ");
				Double a = sc.nextDouble();
				System.out.print("Introduzca 'b': ");
				Double b = sc.nextDouble();
				System.out.println("Resultado: " + a / b);
				if (a == 0 || b == 0) {
					throw new MyException("El valor no puede ser cero");
				}
				datosCorrectos=true;

			} catch (InputMismatchException e) { 
				System.out.println(e.getMessage() + " " + e.getStackTrace());
				
			} catch (MyException e) {
				System.out.println(e.getExcepcion());
			}
		}
	}
}
