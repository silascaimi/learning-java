package com.java.basic.enums.naipe;

public class App {

	public static void main(String[] args) {

		Carta carta1 = new Carta(4, Naipe.PAUS);

		System.out.println(carta1.getNumero());
		System.out.println(carta1.getNaipe());

		System.out.println(carta1.getNaipe().getCor());
	}

}
