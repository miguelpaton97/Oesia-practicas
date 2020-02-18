package ejBuilder;

public class MeatLoverPizza  extends PizzaBuilder{

	public MeatLoverPizza() {
		super.pizza = new Pizza();
	}
	
	public void creaMasa() {
		pizza.setMasa("Tradicional");
	}

	public void creaSalsa() {
		pizza.setSalsa("Salsa de tomate");
	}

	public void creaRelleno() {
		pizza.setRelleno("Jamon york, bacon, ternera, pepperoni");
	}
	
	

}
