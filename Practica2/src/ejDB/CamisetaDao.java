package ejDB;

public interface CamisetaDao {

	String insertCamiseta(Camiseta camiseta, int cod_contenedor);

	String deleteCamiseta(int modelo);

	String updateCamiseta(Camiseta camiseta);

	String findCamisetaById(int modelo);

	String findAllCamisetas();

}
