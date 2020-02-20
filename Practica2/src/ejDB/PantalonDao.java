package ejDB;

public interface PantalonDao {

	String insertPantalon(Pantalon pantalon, int cod_contenedor);

	String deletePantalon(int modelo);

	String updatePantalon(Pantalon pantalon);

	String findPantalonById(int modelo);

	String findAllPantalones();

}
