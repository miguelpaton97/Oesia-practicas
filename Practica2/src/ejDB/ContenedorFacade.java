package ejDB;

public interface ContenedorFacade {

	String insertContenedor(Contenedor container);

	String deleteContenedor(int codigo);

	String updateContenedor(Contenedor container);

	String findContenedorById(int codigo);

	String findAllContenedores();

}
