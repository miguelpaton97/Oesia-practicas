package ejerciciosExtras.excepciones;


public class Ej1Excepciones {

	public static void main(String[] args) throws MyException{
		
		try {
			throw new MyException("Esta excepcion ha sido creada por el programador");
		} catch(MyException excepcion) {
			System.out.println(excepcion.getExcepcion());
		}

	}

}
