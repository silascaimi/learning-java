package com.java.basic.io.writing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class App {

	static String path = "src/com/java/basic/io/";

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String s = "Texto para ser gravado no arquivo";

		/*
		 * // Método 1 try(OutputStream os = new FileOutputStream("saida.txt")){
		 * 
		 * byte[] buffer = s.getBytes();
		 * 
		 * os.write(buffer); }
		 */

		/*
		 * // Método 2 try(BufferedWriter writer = new BufferedWriter(new
		 * FileWriter("saida.txt"))){ writer.write(s); }
		 */

		// Método 3
		// Continua gravando no final do arquivo existente
		String fileName = path + "saida.txt";
		try (PrintWriter pw = new PrintWriter(new FileOutputStream(fileName, true))) {
			pw.println(s);
		}

	}

}
