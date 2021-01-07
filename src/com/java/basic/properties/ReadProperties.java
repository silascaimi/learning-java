package com.java.basic.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties prop = new Properties();
		prop.load(new FileInputStream("src/com/java/basic/properties/config.properties"));
		
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");
		
		System.out.printf("Conectando no banco de dados de url: %s e usuario %s\n", url, usuario);
		
		try {
			int x = 5/0;
		} catch(Exception e){
			Exception error = new Exception("Erro de conexão", e);
			String email = prop.getProperty("email.admin");
			System.err.printf("Enviando email para: %s informando o erro: %s", email, error.getMessage());
		}
	}

}
