package ejDB;

public interface ContenedorDao {

	String insertContenedor(Contenedor container);

	String deleteContenedor(int codigo);

	String updateContenedor(Contenedor container);

	String findContenedorById(int codigo);

	String findAllContenedores();

}
