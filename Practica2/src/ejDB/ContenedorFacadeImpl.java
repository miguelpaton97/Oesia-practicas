package ejDB;

public class ContenedorFacadeImpl implements ContenedorFacade {

	private ContenedorDao contenedorDao = new ContenedorDaoImpl();

	public String insertContenedor(Contenedor container) {
		return contenedorDao.insertContenedor(container);
	}

	public String deleteContenedor(int codigo) {
		return contenedorDao.deleteContenedor(codigo);
	}

	public String updateContenedor(Contenedor container) {
		return contenedorDao.updateContenedor(container);
	}

	public String findContenedorById(int codigo) {
		return contenedorDao.findContenedorById(codigo);
	}

	public String findAllContenedores() {
		return contenedorDao.findAllContenedores();
	}

}
