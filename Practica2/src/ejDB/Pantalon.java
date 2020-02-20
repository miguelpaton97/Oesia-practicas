package ejDB;

public class Pantalon {

	private final int modelo;
	private int talla;

	public Pantalon(int modelo, int talla) {
		super();
		this.modelo = modelo;
		this.talla = talla;
	}

	public int getModelo() {
		return modelo;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String toString() {
		return "Pantalon [modelo = " + modelo + ", talla = " + talla + "]";
	}

}
