package ejBuilder;

public class Pizzeria {

	public static void main(String[] args) {

		Cocina cocina = new Cocina();
		
		cocina.setPizzaBuilder(new MeatLoverPizza());
		cocina.construirPizza();
		Pizza pizza = cocina.getPizza();
		
		System.out.println(pizza);
		
		cocina.setPizzaBuilder(new BarbacoaPizza());
		cocina.construirPizza();
		pizza = cocina.getPizza();
		
		System.out.println(pizza);
		
		cocina.setPizzaBuilder(new CuatroQuesosPizza());
		cocina.construirPizza();
		pizza = cocina.getPizza();
		
		System.out.println(pizza);
	}

}
