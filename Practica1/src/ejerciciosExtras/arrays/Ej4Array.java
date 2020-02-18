package ejerciciosExtras.arrays;

public class Ej4Array {

	public static void main(String[] args) {

		int[][] matrix = new int[5][6];
		rellenaMatriz(matrix);
		int[][] transpose = transposeMatrix(matrix);
		
		System.out.println("La matriz original: ");
		muestraMatriz(matrix);
		System.out.println("\nY su correspondiente traspuesta: \n");
		muestraMatriz(transpose);

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

	private static int[][] transposeMatrix(int[][] matrix) {
		int[][] transpose = new int[matrix[0].length][matrix.length];

		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[0].length; y++) {
				transpose[y][x] = matrix[x][y];
			}
		}

		return transpose;
	}

}
