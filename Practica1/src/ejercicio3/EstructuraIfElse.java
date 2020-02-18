package ejercicio3;

public class EstructuraIfElse {
	
	
	public String mesPorNum(int i) {
	
	String res = "";
	
	if(i==1) {
		res = Meses.ENERO.toString();
	}
	if(i==2) {
		res = Meses.FEBRERO.toString();
	}
	if(i==3) {
		res = Meses.MARZO.toString();
	}
	if(i==4) {
		res = Meses.ABRIL.toString();
	}
	if(i>=5 && i<=8) {
		if(i==5) {
			res = Meses.MAYO.toString();
		}else {
			if(i==6) {
				res = Meses.JUNIO.toString();
			}else {
				if(i==7) {
					res = Meses.JULIO.toString();
				} else {
					res = Meses.AGOSTO.toString();
				}
			}
		}
	} else if(i==9) {
		res = Meses.SEPTIEMBRE.toString();
	} else if(i==10) {
		res = Meses.OCTUBRE.toString();
	} else if (i==11) {
		res = Meses.NOVIEMBRE.toString();
	} else if (i==12) {
		res = Meses.DICIEMBRE.toString();
	} else if(i<1 || i>12){
		res = "No existe ningún mes correspondiente a ese número";
	}
	return res;
	}
}
