package ejDB;

public interface CamisetaFacade {

	String insertCamiseta(Camiseta camiseta, int cod_contenedor);

	String deleteCamiseta(int modelo);

	String updateCamiseta(Camiseta camiseta);

	String findCamisetaById(int modelo);

	String findAllCamisetas();

}
