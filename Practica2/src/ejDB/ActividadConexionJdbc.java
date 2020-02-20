package ejDB;

import java.sql.SQLException;

public class ActividadConexionJdbc {

	public ActividadConexionJdbc() {

	}

	public static void main(String[] args) throws SQLException {

		ComenzarActividad.getInstance().start();

	}

}
