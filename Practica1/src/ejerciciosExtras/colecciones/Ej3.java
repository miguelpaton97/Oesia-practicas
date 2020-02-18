package ejerciciosExtras.colecciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Ej3 {

	public static void main(String[] args){

		
		try {
			leeFichero("archivos/texto.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void leeFichero(String file) throws FileNotFoundException, IOException {
		List<String> listLines = new LinkedList<String>();
		String line;
		try {
		FileReader reader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		while ((line = buffer.readLine()) != null) {
			String regex = "\\[|\\]";
			line = line.replace(" ", "");
			line = line.replaceAll(regex, "");
			listLines.add(line);
		}
		reader.close();
		} catch(Exception excepcion) {
			System.out.println("Excepcion leyendo el fichero " + file + ": " + excepcion);
		}

		for (String linea : listLines) {
			try{
				operador(linea);
			} catch(Exception exception) {
				System.out.println("Excepcion leyendo la linea del archivo " + file + ": " + exception);
			}
		}
	}

	private static void operador(String linea) {
		TreeSet<Integer> numsBeforeOperator = new TreeSet<Integer>();
		TreeSet<Integer> numsAfterOperator = new TreeSet<Integer>();
		TreeSet<Integer> result = new TreeSet<Integer>();
		String[] trozos = null;

		if (linea.contains("+")) {
			trozos = linea.split("\\+");
		} else if (linea.contains("-")) {
			trozos = linea.split("\\-");
		} else if (linea.contains("*")) {
			trozos = linea.split("\\*");
		}

		guardaNumeros(trozos, numsBeforeOperator, 0);
		guardaNumeros(trozos, numsAfterOperator, 1);

		String operador = "";
		if (linea.contains("+")) {
			operador = " + ";
			result.addAll(numsBeforeOperator);
			result.addAll(numsAfterOperator);

		} else if (linea.contains("-")) {
			operador = " - ";
			result.addAll(numsBeforeOperator);
			result.removeAll(numsAfterOperator);

		} else if (linea.contains("*")) {
			operador = " * ";
			result.addAll(numsBeforeOperator);
			result.retainAll(numsAfterOperator);

		}

		System.out.println(numsBeforeOperator + operador + numsAfterOperator + "  --------  " + result);

	}

	private static void guardaNumeros(String[] trozos, TreeSet<Integer> numeros, int posicion) {
		String[] numSeparados = trozos[posicion].split(",");
		for (String s : numSeparados) {
			Integer numero = Integer.parseInt(s);
			if (numero >= 0) {
				numeros.add(numero);
			}
		}
	}

}
