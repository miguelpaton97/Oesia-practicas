package ejDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ComenzarActividad {

	private static ComenzarActividad INSTANCE = null;

	private ComenzarActividad() {

	}

	public static ComenzarActividad getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ComenzarActividad();
		}
		return INSTANCE;
	}

	public void start() throws SQLException {

		Connection connection = null;

		try {
			connection = ConectaJdbc.getInstance().creaConexionDb();

			Pantalon pantalon1 = new Pantalon(((int) (Math.random() * 1000)), 40);
			Pantalon pantalon2 = new Pantalon(((int) (Math.random() * 1000)), 42);
			Pantalon pantalon3 = new Pantalon(((int) (Math.random() * 1000)), 36);

			Camiseta camiseta1 = new Camiseta(((int) (Math.random() * 1000)), 40, "rojo");
			Camiseta camiseta2 = new Camiseta(((int) (Math.random() * 1000)), 48, "azul");
			Camiseta camiseta3 = new Camiseta(((int) (Math.random() * 1000)), 36, "verde");

			List<Camiseta> listCamiseta1 = new ArrayList<Camiseta>();

			listCamiseta1.add(camiseta1);
			listCamiseta1.add(camiseta2);
			listCamiseta1.add(camiseta3);
			CamisetaFacade camisetaFacadeImpl = new CamisetaFacadeImpl();

			List<Pantalon> listPantalon1 = new ArrayList<Pantalon>();
			listPantalon1.add(pantalon1);
			listPantalon1.add(pantalon2);
			listPantalon1.add(pantalon3);
			PantalonFacade pantalonFacadeImpl = new PantalonFacadeImpl();

			Contenedor contenedor = new Contenedor(((int) (Math.random() * 1000)), TipoContenedor.BULTO, ((int) (Math.random() * 300)),
					listCamiseta1, listPantalon1);
			ContenedorFacade contenedorFacadeImpl = new ContenedorFacadeImpl();

			this.crearSentencia(connection, contenedorFacadeImpl.insertContenedor(contenedor));
//			ResultSet resultSet = this.buscaSentencia(connection, contenedorFacadeImpl.findContenedorById(contenedor.getCodigo()));
			ResultSet resultSet = this.buscaSentencia(connection, contenedorFacadeImpl.findAllContenedores());

			for (Camiseta camiseta : listCamiseta1) {
				this.crearSentencia(connection, camisetaFacadeImpl.insertCamiseta(camiseta, contenedor.getCodigo()));
			}

			for (Pantalon pantalon : listPantalon1) {
				this.crearSentencia(connection, pantalonFacadeImpl.insertPantalon(pantalon, contenedor.getCodigo()));
			}

			this.mostrarResultado(resultSet);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

	private void mostrarResultado(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			System.out.println(String.format("Contenedor: " + "Codigo - " + resultSet.getString(1)
					+ ", TipoContenedor - " + resultSet.getString(2) + ", Max_Prenda - " + resultSet.getString(3)));
		}
	}

	private void crearSentencia(Connection connection, String sentence) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate(sentence);
	}

	private ResultSet buscaSentencia(Connection connection, String sentence) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sentence);
		return resultSet;
	}

}
