package ejDB;

public class PantalonDaoImpl implements PantalonDao {

	public String insertPantalon(Pantalon pantalon, int cod_contenedor) {

		String insert = "INSERT INTO Pantalon (modelo, talla, cod_contenedor) values('" + pantalon.getModelo() + "', '"
				+ pantalon.getTalla() + "', '" + cod_contenedor + "');";
		return insert;
	}

	public String deletePantalon(int modelo) {

		String delete = "DELETE FROM Pantalon WHERE modelo='" + modelo + "';";
		return delete;
	}

	public String updatePantalon(Pantalon pantalon) {

		String update = "UPDATE Camiseta SET talla='" + pantalon.getTalla() + "' WHERE codigo='" + pantalon.getModelo()
				+ "';";
		return update;
	}

	public String findPantalonById(int modelo) {

		String find = "SELECT * FROM Pantalon WHERE modelo='" + modelo + "';";
		return find;
	}

	public String findAllPantalones() {

		String findAll = "SELECT * FROM Pantalon";
		return findAll;
	}

}
