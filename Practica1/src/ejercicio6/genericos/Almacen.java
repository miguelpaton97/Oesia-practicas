package ejercicio6.genericos;

import java.util.HashSet;
import java.util.Set;

public class Almacen {

	public static void main(String[] args) {

		Set<Caja<?>> stock = new HashSet<Caja<?>>();

		Libreta lib1 = new Libreta("LIB0001", 235);
		Libreta lib2 = new Libreta("LIB0002", 521);
		Libreta lib3 = new Libreta("LIB0003", 465);
		Libreta lib4 = new Libreta("LIB0004", 9876);

		Boligrafo bol1 = new Boligrafo("BOL0001", "Rojo");
		Boligrafo bol2 = new Boligrafo("BOL0002", "Azul");
		Boligrafo bol3 = new Boligrafo("BOL0003", "Negro");
		Boligrafo bol4 = new Boligrafo("BOL0004", "Morado");
		Boligrafo bol5 = new Boligrafo("BOL0005", "Verde");

		Caja<Libreta> box1 = new Caja<Libreta>(10);
		Caja<Boligrafo> box2 = new Caja<Boligrafo>(10);

//		box2.add(lib1);

		box1.add(lib1);
		box1.add(lib2);
		box1.add(lib3);
		box1.add(lib4);

		box2.add(bol1);
		box2.add(bol2);
		box2.add(bol3);
		box2.add(bol4);
		box2.add(bol5);

		stock.add(box1);
		stock.add(box2);

		stock.add(box1);

		for (Caja<?> c : stock) {
			System.out.println(c);
		}
	}

}
