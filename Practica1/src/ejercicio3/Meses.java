package ejercicio3;

public enum Meses {
	ENERO(1, "Enero", "January"), FEBRERO(2, "Febrero", "February"), MARZO(3, "Marzo", "March"),
	ABRIL(4, "Abril", "April"), MAYO(5, "Mayo", "May"), JUNIO(6, "Junio", "June"),
	JULIO(7, "Julio", "July"), AGOSTO(8, "Agosto", "August"), SEPTIEMBRE(9, "Septiembre", "September"),
	OCTUBRE(10, "Octubre", "October"), NOVIEMBRE(11, "Noviembre", "November"), DICIEMBRE(12, "Diciembre", "December");

	private final int numMes;
	private final String nombreES;
	private final String nombreEN;

	private Meses(int numMes, String nombreES, String nombreEN) {
		this.numMes = numMes;
		this.nombreES = nombreES;
		this.nombreEN = nombreEN;
	}

	public int getNumMes() {
		return this.numMes;
	}

	public String getNombreES() {
		return this.nombreES;
	}

	public String getNombreEN() {
		return this.nombreEN;
	}

}
