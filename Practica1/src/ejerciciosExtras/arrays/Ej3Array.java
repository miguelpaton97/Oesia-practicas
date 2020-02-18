package ejerciciosExtras.arrays;

import java.util.Scanner;

public class Ej3Array {

	public static void main(String[] args) {
		hojaExcel();
	}

	private static void rellenaHoja(int[][] hoja) {
		int fila = hoja.length;
		int columna = hoja[0].length;
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < fila; x++) {
			for (int y = 0; y < columna; y++) {
				int num = sc.nextInt();
				hoja[x][y] = num;
			}
		}
		sc.close();
	}

	private static void hojaExcel() {
		int fila = 4;
		int columna = 5;

		int[][] hoja = new int[fila][columna];
		rellenaHoja(hoja);

		for (int x = 0; x < fila; x++) {
			int suma = 0;
			int n = 0;
			for (int y = 0; y < columna; y++) {
				n = hoja[x][y];
				System.out.print(n + "   ");
				suma += n;
				if (y == (columna - 1)) {
					System.out.print(" =   " + suma);
				}
			}
			System.out.println();
		}

		int total = 0;
		for (int y = 0; y < columna; y++) {
			int suma = 0;
			int n = 0;
			for (int x = 0; x < fila; x++) {
				n = hoja[x][y];
				suma += n;
			}
			System.out.print(suma + "   ");
			total += suma;
		}
		System.out.println(" =   " + total);

	}

}
