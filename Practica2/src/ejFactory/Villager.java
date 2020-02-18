package ejFactory;

public class Villager implements Person {

	public String create() {
		return "Crea Villager";

	}

	@Override
	public String toString() {
		return create();
	}

}
