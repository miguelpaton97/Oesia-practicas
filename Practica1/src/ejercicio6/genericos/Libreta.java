package ejercicio6.genericos;

public class Libreta {

	private final String codigo;
	private final Integer numPaginas;

	public Libreta(String codigo, Integer numPaginas) {
		this.codigo = codigo;
		this.numPaginas = numPaginas;
	}

	public String getCodigo() {
		return codigo;
	}

	public Integer getNumPaginas() {
		return numPaginas;
	}

	@Override
	public String toString() {
		return "Libreta [codigo=" + codigo + ", numPaginas=" + numPaginas + "]";
	}

}
