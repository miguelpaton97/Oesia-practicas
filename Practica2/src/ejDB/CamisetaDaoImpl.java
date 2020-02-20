package ejDB;

public class CamisetaDaoImpl implements CamisetaDao {

	public String insertCamiseta(Camiseta camiseta, int cod_contenedor) {

		String insert = "INSERT INTO Camiseta (modelo, talla, color, cod_contenedor) values('" + camiseta.getModelo()
				+ "', '" + camiseta.getTalla() + "', '" + camiseta.getColor() + "', '" + cod_contenedor + "');";
		return insert;
	}

	public String deleteCamiseta(int modelo) {

		String delete = "DELETE FROM Camiseta WHERE modelo='" + modelo + "';";
		return delete;
	}

	public String updateCamiseta(Camiseta camiseta) {

		String update = "UPDATE Camiseta SET talla='" + camiseta.getTalla() + "', color='" + camiseta.getColor()
				+ "' WHERE codigo='" + camiseta.getModelo() + "';";
		return update;
	}

	public String findCamisetaById(int modelo) {

		String find = "SELECT * FROM Camiseta WHERE modelo='" + modelo + "';";
		return find;
	}

	public String findAllCamisetas() {

		String findAll = "SELECT * FROM Camiseta";
		return findAll;
	}

}
