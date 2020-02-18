package ejBuilder;

public class CuatroQuesosPizza  extends PizzaBuilder{

	public CuatroQuesosPizza() {
		super.pizza = new Pizza();
	}
		
	public void creaMasa() {
		pizza.setMasa("Bordes de queso");
	}

	public void creaSalsa() {
		pizza.setSalsa("Tomate frito");
	}

	public void creaRelleno() {
		pizza.setRelleno("Quesos");
	}

}
