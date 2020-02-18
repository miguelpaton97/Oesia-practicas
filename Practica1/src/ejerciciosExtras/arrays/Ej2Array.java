package ejerciciosExtras.arrays;

public class Ej2Array {

	public static void main(String[] args) {
		muestraMinMax(6, 10);

	}

	private static void muestraMinMax(int fila, int columna) {
		int[][] matrix = new int[fila][columna];
		rellenaMatriz(matrix);
		
		int xMax = 0;
		int yMax = 0;
		int xMin = 0;
		int yMin = 0;

		int nMax = matrix[0][0];
		int nMin = matrix[0][0];
		for (int x = 0; x < fila; x++) {
			for (int y = 0; y < columna; y++) {
				int num = matrix[x][y];
				if (num < nMin) {
					nMin = num;
					xMin = x;
					yMin = y;
				}
				if (num > nMax) {
					nMax = num;
					xMax = x;
					yMax = y;
					
				}
			}
		}
		
		muestraMatriz(matrix);
		System.out.println("\n\nEl número máximo de la matriz es: " + nMax + "; en la posicion: " + xMax + ", " + yMax);
		System.out.println("El número mínimo de la matriz es: " + nMin + "; en la posicion: " + xMin + ", " + yMin);
	}

	private static void rellenaMatriz(int[][] matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
		for (int x = 0; x < filas; x++) {
			for (int y = 0; y < columnas; y++) {
				int num = (int) Math.floor(Math.random() * 1000 + 1);
				matriz[x][y] = num;
			}
		}
	}
	
	private static void muestraMatriz(int[][] matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
		for (int x = 0; x < filas; x++) {
			for (int y = 0; y < columnas; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println("");
		}
	}

}
