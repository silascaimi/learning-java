package com.java.basic.io.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {
	
	static String path = "src/com/java/basic/io/";

	public static void main(String[] args) throws IOException {

		String inputFile = path + "entrada.txt";
		String outputFile = path + "saida.txt";

		try (InputStream in = new FileInputStream(inputFile); OutputStream out = new FileOutputStream(outputFile)) {

			byte[] buffer = new byte[1024];

			int bytesLidos;
			while ((bytesLidos = in.read(buffer)) > -1) {
				out.write(buffer, 0, bytesLidos);
			}
		}

	}

}
