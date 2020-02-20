package ejDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaJdbc {

	private static ConectaJdbc INSTANCE = null;

	private ConectaJdbc() {

	}

	public static ConectaJdbc getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ConectaJdbc();
		}
		return INSTANCE;
	}

	public Connection creaConexionDb() throws ClassNotFoundException, SQLException {
		String driverUrl = "jdbc:mysql://localhost:3306/test";
		Connection connection = DriverManager.getConnection(driverUrl, "root", "");

		if (connection != null) {
			System.out.println("Conexion a BBDD establecida con exito");
		}
		return connection;
	}

}
