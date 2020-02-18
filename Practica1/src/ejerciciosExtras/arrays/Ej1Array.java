package ejerciciosExtras.arrays;

public class Ej1Array {

	public static void main(String[] args) {

		randomNumsArray();

	}

	private static void randomNumsArray() {
		int[] numList = new int[20];
		int[] numListRandom = new int[20];
		for (int i = 0; i < 20; i++) {
			int num = (int) Math.floor(Math.random() * 100 + 1);
			numListRandom[i] = num;
		}
		int orden = 0;
		for (int n : numListRandom) {
			if (n % 2 == 0) {
				numList[orden] = n;
				orden++;
			}
		}
		for (int n : numListRandom) {
			if (n % 2 != 0) {
				numList[orden] = n;
				orden++;
			}
		}

		System.out.println("tamaño del Array: " + numList.length + "\n");
		muestraArray(numList);
	}

	private static void muestraArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
