package ejercicio6.genericos;

public class Boligrafo {

	private final String codigo;
	private final String color;

	public Boligrafo(String codigo, String color) {
		this.codigo = codigo;
		this.color = color;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Boligrafo [codigo=" + codigo + ", color=" + color + "]";
	}

}
