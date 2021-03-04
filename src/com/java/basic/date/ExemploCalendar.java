package com.java.basic.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExemploCalendar {

	public static void main(String[] args) {

		// Cria um objeto Calendar com a hora atual
		Calendar c1 = new GregorianCalendar();

		// Captura a data e hora atual
		Calendar c2 = Calendar.getInstance();

		// Atribui os valores ao objeto Calendar
		c1.set(Calendar.DAY_OF_MONTH, 20);
		c1.set(Calendar.MONTH, 10);
		c1.set(Calendar.YEAR, 1987);
		c1.set(Calendar.HOUR_OF_DAY, 15);
		c1.set(Calendar.MINUTE, 30);
		c1.set(Calendar.SECOND, 0);
		// Met�do completo c1.set(1987, 10, 20, 15, 30);

		// Captura um Date de um Calendar
		Date aniversario = c1.getTime();

		// Captura um Calendar de um Date
		c2.setTime(aniversario);

		System.out.println(aniversario);

		// Calendar para String
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String dataNascimento = f.format(c1.getTime());

		System.out.println(dataNascimento);

		// Somando ou subtraindo datas
		c2.add(Calendar.MONTH, 1); // Adiciona 1 m�s
		c2.roll(Calendar.DAY_OF_MONTH, -5); // Subtrai 10 dias apenas do DIAS

		System.out.println(c2.getTime());
	}
}
