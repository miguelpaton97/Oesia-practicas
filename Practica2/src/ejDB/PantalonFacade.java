package ejDB;

public interface PantalonFacade {

	String insertPantalon(Pantalon pantalon, int cod_contenedor);

	String deletePantalon(int modelo);

	String updatePantalon(Pantalon pantalon);

	String findPantalonById(int modelo);

	String findAllPantalones();

}
