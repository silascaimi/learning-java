package com.java.basic.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatClass {
	
	public static void main(String[] args) {

		// Exibe data e hora atual
		Date hoje = new Date();
		System.out.println(hoje);
		
		System.out.println();
		  
		// Cria formatador de data
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat fShort = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat fMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat fLong = DateFormat.getDateInstance(DateFormat.LONG);
		//
		DateFormat fLongIngles = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","US"));
		
		// Transforma um Date formatado em uma String
		String dataHoje = f.format(hoje);
		System.out.println("Simple: " + dataHoje);	// 30/03/2021
		
		dataHoje = fShort.format(hoje);
		System.out.println("Short: " + dataHoje);	// 30/03/2021
		
		dataHoje = fMedium.format(hoje);
		System.out.println("Medium: " + dataHoje);	// 30 de mar. de 2021
		
		dataHoje = fLong.format(hoje);
		System.out.println("Long: " + dataHoje);	// 30 de março de 2021
		
		dataHoje = fLongIngles.format(hoje);
		System.out.println("Long Ingles: " + dataHoje);		// March 30, 2021
		
		
		System.out.println();
		// Transforma um String em um Date
		String dataAniversario = "20/11/1987";
		try {
			Date aniversario = f.parse(dataAniversario);
			System.out.println("Aniversario: " + aniversario);	// Fri Nov 20 00:00:00 GMT-03:00 1987
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
		//-----------------------------------
		
		// Obtem um valor em miliseguntos representando o Date
		Date date = new Date();
		long mili = date.getTime();
		System.out.println(mili);
		 
	}

}
