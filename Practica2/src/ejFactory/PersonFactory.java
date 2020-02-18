package ejFactory;

public class PersonFactory {

	public static Person create(Citizens type) {
//		if(type==null) {
//			throw new IllegalArgumentException("null value");
//		}
//		if(type.equalsIgnoreCase("city")) {
//			return new CityPerson();
//		} else if(type.equalsIgnoreCase("village")) {
//			return new Villager();
//		} else {
//			throw new IllegalArgumentException("invalid value");
//		}
		Person person;

		switch (type) {
		case CITY_PERSON:
			person = new CityPerson();
			break;
		case VILLAGER:
			person = new Villager();
			break;
		default:
			person = null;
			System.out.println("invalid value");
			break;
		}

		return person;
	}

}
