package com.java.basic.io.reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	static String path = "src/com/java/basic/io/";

	public static void main(String[] args) {

		String fileName = path + "entrada.txt";

		/*
		 * // Método 1
		 * 
		 * try (InputStream is = new FileInputStream(fileName)) {
		 * 
		 * byte[] buffer = new byte[1024];
		 * 
		 * int bytesLidos = is.read(buffer); // Quantidade de bytes lidos
		 * 
		 * // Cria String com bytesLidos para evitar lixo String texto = new
		 * String(buffer, 0, bytesLidos);
		 * 
		 * System.out.println(texto); }
		 * 
		 */

		/*
		 * // Método 2 // Maneira de criação dinâmica alocando apenas o espaço
		 * necessário
		 * 
		 * try (InputStream is = new FileInputStream(fileName)) {
		 * 
		 * byte[] buffer = new byte[4];
		 * 
		 * StringBuilder texto = new StringBuilder(); int bytesLidos;
		 * 
		 * while((bytesLidos = is.read(buffer)) > -1) { texto.append(new String(buffer,
		 * 0, bytesLidos)); }
		 * 
		 * System.out.println(texto); }
		 */

		/*
		 * // Método 3 // Maneira mais simples de se trabalhar
		 * 
		 * try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
		 * 
		 * String texto = ""; String line;
		 * 
		 * while ((line = reader.readLine()) != null) { texto += line + "\n"; }
		 * 
		 * System.out.println(texto); }
		 */

		// Método mais simplificado
		try (Scanner scanner = new Scanner(new File(fileName))) {
			String s = "";
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				s += line + "\n";
			}
			System.out.println(s);
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}
}
