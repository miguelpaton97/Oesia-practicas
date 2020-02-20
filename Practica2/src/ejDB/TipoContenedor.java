package ejDB;

public enum TipoContenedor {

	PALE(1), BULTO(2), CAJA(3);

	private final int id;

	private TipoContenedor(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
