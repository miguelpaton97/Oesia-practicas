package ejDB;

public class Camiseta {

	private final int modelo;
	private int talla;
	private String color;

	public Camiseta(int modelo, int talla, String color) {
		super();
		this.modelo = modelo;
		this.talla = talla;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Camiseta [modelo = " + modelo + ", talla = " + talla + ", color = " + color + "]";
	}

}
