package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {

		int portales = 3;
		int altura = 4;
		int vivienda = 2;

		int[][][] calle = new int[portales][altura][vivienda];

		for (int x = 0; x < portales; x++) {
			for (int y = 0; y < altura; y++) {
				for (int z = 0; z < vivienda; z++) {
					calle[x][y][z] = 0;
				}
			}
		}

		calle[1][2][0] = 1;
		calle[0][1][1] = 1;
		calle[1][3][1] = 1;
		calle[2][2][0] = 1;
		calle[0][3][0] = 1;

		for (int x = 0; x < portales; x++) {
			for (int y = 0; y < altura; y++) {
				for (int z = 0; z < vivienda; z++) {
					if (calle[x][y][z] == 0) {
						System.out.println("Portal: " + x + "; Altura: " + y + "; Vivienda: " + z);

					}
				}
			}
		}
	}

}
