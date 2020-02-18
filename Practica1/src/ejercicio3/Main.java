package ejercicio3;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		EstructuraIfElse eie = new EstructuraIfElse();
		EstructuraSwitch sw = new EstructuraSwitch();
		EstructuraFor efor = new EstructuraFor();
		
		Scanner sc = new Scanner(System.in);
		int programa = sc.nextInt();
		String res = "";
		switch (programa) {
		case 1:
			
			int i = sc.nextInt();
			res = eie.mesPorNum(i);
			
			break;

		case 2:
			
			int idioma = sc.nextInt();
			int mes = sc.nextInt();
			
			res = sw.mesPorNum(idioma, mes);
			break;
			
		case 3:
			
			List<Integer> numPrimos = efor.numPrimos();
			for(int iterator = 0; iterator<numPrimos.size(); iterator++) {
				if(iterator==0) {
					res = "" + numPrimos.get(iterator);
				}else {
				res = res + ", " + numPrimos.get(iterator);
				}
			}
			efor.mesesPares();
			efor.mesesImpares();
			
			break;
			
			
		default:
			
			res= "No existe ningún metodo correspondiente a esa numeración";
			break;
		}		
		
		System.out.println(res);
		
		sc.close();
		
		
		
		
	}

}
