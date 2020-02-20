package ejDB;

public class CamisetaFacadeImpl implements CamisetaFacade {

	private CamisetaDao camisetaDao = new CamisetaDaoImpl();

	public String insertCamiseta(Camiseta camiseta, int cod_contenedor) {
		return camisetaDao.insertCamiseta(camiseta, cod_contenedor);
	}

	public String deleteCamiseta(int modelo) {
		return camisetaDao.deleteCamiseta(modelo);
	}

	public String updateCamiseta(Camiseta camiseta) {
		return camisetaDao.updateCamiseta(camiseta);
	}

	public String findCamisetaById(int modelo) {
		return camisetaDao.findCamisetaById(modelo);
	}

	public String findAllCamisetas() {
		return camisetaDao.findAllCamisetas();
	}

}
