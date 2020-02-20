package ejDB;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

	private final int codigo;
	private final TipoContenedor tipo;
	private final int max_prenda;
	private List<Camiseta> listCamiseta = new ArrayList<Camiseta>();
	private List<Pantalon> listPantalon = new ArrayList<Pantalon>();

	public Contenedor(int codigo, TipoContenedor tipo, int max_prenda, List<Camiseta> listCamiseta,
			List<Pantalon> listPantalon) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.max_prenda = max_prenda;
		this.listCamiseta = listCamiseta;
		this.listPantalon = listPantalon;
	}

	public int getCodigo() {
		return codigo;
	}

	public TipoContenedor getTipo() {
		return tipo;
	}

	public int getMax_prenda() {
		return max_prenda;
	}

	public List<Camiseta> getListCamiseta() {
		return listCamiseta;
	}

	public List<Pantalon> getListPantalon() {
		return listPantalon;
	}

	public String toString() {
		return "Contenedor [codigo = " + codigo + ", tipo = " + tipo + ", max_prenda = " + max_prenda + "]";
	}

}
