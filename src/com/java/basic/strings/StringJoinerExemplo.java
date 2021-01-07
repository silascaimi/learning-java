package com.java.basic.strings;

import java.util.StringJoiner;

public class StringJoinerExemplo {

	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner(", ");
		sj1.add("alpha");
		sj1.add("theta");		
		sj1.add("gama");
		String result1 = sj1.toString();	
		System.out.println(result1);			// alpha, theta, gama
		
		
		// Join com separadores
		StringJoiner sj2 = new StringJoiner(", ", "[", "]");
		sj2.add("alpha");
		sj2.add("theta");		
		sj2.add("gama");	
		System.out.println(sj2.toString());		// [alpha, theta, gama]
		
		//
		StringJoiner sj3 = new StringJoiner("], [", "[","]");
		sj3.add("alpha");
		sj3.add("theta");		
		sj3.add("gama");
		System.out.println(sj3.toString());		// [alpha], [theta], [gama]
		
		StringJoiner sj4 = new StringJoiner(", ", "{", "}");
		sj4.setEmptyValue("EMPTY");
		System.out.println(sj4.toString());		// EMPTY

	}

}
