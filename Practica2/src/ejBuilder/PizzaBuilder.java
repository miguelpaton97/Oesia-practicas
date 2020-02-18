package ejBuilder;

public abstract class PizzaBuilder {
	
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return this.pizza;
	}
	
	public abstract void creaMasa();
		
	public abstract void creaSalsa();
		
	public abstract void creaRelleno();
		

}
