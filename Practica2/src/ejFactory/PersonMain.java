package ejFactory;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = PersonFactory.create(Citizens.CITY_PERSON);
		Person p2 = PersonFactory.create(Citizens.VILLAGER);

		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
