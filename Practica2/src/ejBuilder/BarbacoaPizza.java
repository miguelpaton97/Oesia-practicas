package ejBuilder;

public class BarbacoaPizza  extends PizzaBuilder{

	public BarbacoaPizza() {
		super.pizza = new Pizza();
	}
		
	public void creaMasa() {
		pizza.setMasa("Fina");
	}

	public void creaSalsa() {
		pizza.setSalsa("Salsa barbacoa");
	}

	public void creaRelleno() {
		pizza.setRelleno("Bacon, ternera, pollo");
	}

}
