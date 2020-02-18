package ejercicio2_otropaquete;

public class OtroManagerImpl extends AbstractManager{

	@Override
	public String procesar(String dato) {
		String res = "Se ha procesado " + dato;
		return res;
	}

	@Override
	Integer devolverCuadrado(Integer i) {
		Integer res = (int) Math.pow(i, 2);
		return res;
	}

}
