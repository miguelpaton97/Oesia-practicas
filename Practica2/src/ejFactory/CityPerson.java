package ejFactory;

public class CityPerson implements Person {

	public String create() {
		return "Crea CityPerson";

	}

	@Override
	public String toString() {
		return create();
	}

}
