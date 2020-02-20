package ejDB;


public class PantalonFacadeImpl implements PantalonFacade {

	private PantalonDao pantalonDao = new PantalonDaoImpl();

	public String insertPantalon(Pantalon pantalon, int cod_contenedor) {
		return pantalonDao.insertPantalon(pantalon, cod_contenedor);
	}

	public String deletePantalon(int modelo) {
		return pantalonDao.deletePantalon(modelo);
	}

	public String updatePantalon(Pantalon pantalon) {
		return pantalonDao.updatePantalon(pantalon);
	}

	public String findPantalonById(int modelo) {
		return pantalonDao.findPantalonById(modelo);
	}

	public String findAllPantalones() {
		return pantalonDao.findAllPantalones();
	}

}
