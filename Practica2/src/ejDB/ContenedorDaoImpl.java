package ejDB;

public class ContenedorDaoImpl implements ContenedorDao {

	public String insertContenedor(Contenedor container) {

		String insert = "INSERT INTO Contenedor (codigo, tipo_contenedor, max_prenda) values('" + container.getCodigo()
				+ "', '" + container.getTipo().getId() + "', '" + container.getMax_prenda() + "');";
		return insert;
	}

	public String deleteContenedor(int codigo) {

		String delete = "DELETE FROM Contenedor WHERE codigo='" + codigo + "';";
		return delete;
	}

	public String updateContenedor(Contenedor container) {
		String update = "UPDATE Contenedor SET tipo_contenedor='" + container.getTipo().getId() + "', max_prenda='"
				+ container.getMax_prenda() + "' WHERE codigo='" + container.getCodigo() + "';";
		return update;
	}

	public String findContenedorById(int codigo) {

		String find = "SELECT * FROM Contenedor WHERE codigo='" + codigo + "';";
		return find;
	}

	public String findAllContenedores() {

		String findAll = "SELECT * FROM Contenedor";
		return findAll;
	}

}
