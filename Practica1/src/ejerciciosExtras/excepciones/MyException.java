package ejerciciosExtras.excepciones;

public class MyException extends Exception {

	private static final long serialVersionUID = -402498161047887578L;
	
	private final String excepcion;

	public MyException(String excepcion) {
		this.excepcion = excepcion;
	}

	public String getExcepcion() {
		return this.excepcion;
	}
	
}
