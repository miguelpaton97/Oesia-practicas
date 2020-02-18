package ejerciciosExtras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej1Colecciones {

	public static void main(String[] args) {
		controlDeAcceso();

	}

	private static void controlDeAcceso() {
		int i = 0;
		Map<String, String> datos = new HashMap<String, String>();
		datos.put("miguel", "miguel");
		datos.put("alvaro", "alvaro");
		datos.put("carlos", "carlos");
		datos.put("ruben", "ruben");
		datos.put("chemita", "chemita");

		Scanner sc = new Scanner(System.in);
		while (i < 3) {
			System.out.print("Ingrese su nombre de usuario: ");
			String usuario = sc.next();
			System.out.print("\nIngrese su contraseña: ");
			String contraseña = sc.next();
			System.out.println("");
			if (datos.containsKey(usuario) && datos.get(usuario).equals(contraseña)) {
				System.out.println("Ha accedido al área restringida");
				break;
			} else {
				i++;
				if (i == 3) {
					System.out.println("Lo siento, no tiene acceso al área restringida");
				}
			}
		}
		sc.close();

	}

}
