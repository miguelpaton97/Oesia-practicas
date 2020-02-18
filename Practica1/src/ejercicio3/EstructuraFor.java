package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class EstructuraFor {

	public List<Integer> numPrimos() {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 2; i <= 100; i++) {
			if (i == 2) {
				res.add(i);
			} else {
				if (esPrimo(i)) {
					res.add(i);
				}
			}
		}
		return res;

	}

	private Boolean esPrimo(Integer iterator) {
		Boolean res = true;
		for (int j = 2; j < iterator; j++) {
			if (iterator % j == 0) {
				res = false;
				break;
			}
		}
		return res;

	}

	public void mesesPares() {
		Meses[] meses = Meses.values();
		for (int i = 1; i <= 11; i = i + 2) {
			Meses mes = meses[i];
			String nombre = mes.getNombreES();
			if (i == 11 || i == 10) {
				System.out.println(nombre);
			} else {
				System.out.print(nombre + ", ");
			}

		}
	}

	public void mesesImpares() {
		Meses[] meses = Meses.values();
		for (int i = 0; i <= 11; i = i + 2) {
			Meses mes = meses[i];
			String nombre = mes.getNombreEN();
			if (i == 11 || i == 10) {
				System.out.println(nombre);
			} else {
				System.out.print(nombre + ", ");
			}
		}
	}
}
