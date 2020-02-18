package ejBuilder;

public class Cocina {
	
	private PizzaBuilder constructor;
	
	public void setPizzaBuilder(PizzaBuilder constructor) {
		this.constructor = constructor;
	}
	
	public Pizza getPizza() {
		return constructor.getPizza();
	}
	
	public void construirPizza() {
		constructor.creaMasa();
		constructor.creaSalsa();
		constructor.creaRelleno();
	}

}
