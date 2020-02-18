package ejercicio3;

public class EstructuraSwitch {
	
	public String mesPorNum(int i, int j) {
		String res = "";
		switch (i) {
		case 1:
			switch(j) {
			case 1:
				res = Meses.ENERO.getNombreES();
				break;
			case 2:
				res = Meses.FEBRERO.getNombreES();
				break;
			case 3:
				res = Meses.MARZO.getNombreES();
				break;
			case 4:
				res = Meses.ABRIL.getNombreES();
				break;
			case 5:
				res = Meses.MAYO.getNombreES();
				break;
			case 6:
				res = Meses.JUNIO.getNombreES();
				break;
			case 7:
				res = Meses.JULIO.getNombreES();
				break;
			case 8:
				res = Meses.AGOSTO.getNombreES();
				break;
			case 9:
				res = Meses.SEPTIEMBRE.getNombreES();
				break;
			case 10:
				res = Meses.OCTUBRE.getNombreES();
				break;
			case 11:
				res = Meses.NOVIEMBRE.getNombreES();
				break;
			case 12:
				res = Meses.DICIEMBRE.getNombreES();
				break;
			default:
				res = "No corresponde ningún mes a ese número";
				break;
			}
			break;
		case 2:
			
			switch(j) {
			case 1:
				res = Meses.ENERO.getNombreEN();
				break;
			case 2:
				res = Meses.FEBRERO.getNombreEN();
				break;
			case 3:
				res = Meses.MARZO.getNombreEN();
				break;
			case 4:
				res = Meses.ABRIL.getNombreEN();
				break;
			case 5:
				res = Meses.MAYO.getNombreEN();
				break;
			case 6:
				res = Meses.JUNIO.getNombreEN();
				break;
			case 7:
				res = Meses.JULIO.getNombreEN();
				break;
			case 8:
				res = Meses.AGOSTO.getNombreEN();
				break;
			case 9:
				res = Meses.SEPTIEMBRE.getNombreEN();
				break;
			case 10:
				res = Meses.OCTUBRE.getNombreEN();
				break;
			case 11:
				res = Meses.NOVIEMBRE.getNombreEN();
				break;
			case 12:
				res = Meses.DICIEMBRE.getNombreEN();
				break;
			default:
				res = "There isn't month that corresponds to that number";
				break;
			}
			
			break;

		default:
			res = "El idioma no es correcto/The language isn't correct";
			
			break;
		}
		return res;
	}

}
