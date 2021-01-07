package com.java.basic.strings;

public class Strings {

	 public static void main(String[] args) {
		
		 String s1 = new String(); // cria novo objeto da classe String
			String s2 = "abc"; // cria uma string
			String s3 = "abc";
			String s4 = new String("abc");

			s1 = s2.toUpperCase();

			System.out.println(s1); // ABC

			System.out.println(s1.concat(s2)); 	// ABCabc

			System.out.println(s2.equals(s3)); 	// true
			System.out.println(s2 == s3); 		// true
			System.out.println(s2.equals(s4));	// true
			System.out.println(s2 == s4);		// false
			
			
			String s5 = "Pedro";
			String s6 = " Pedro   C";

			System.out.println(s5.equalsIgnoreCase(s6)); // false

			System.out.println(s5.charAt(0));			//P

			// Remove caracteres em branco antes e depois da String
			System.out.println(s6.trim()); 				// Pedro   C

			// substring(int beginIndex);
			// substring(int beginIndex, int endIndex);

			System.out.println(s5.indexOf('r'));  // 3

			String curso = "Curso_de_desenvolvimento";
			System.out.println(curso.replaceAll("_", " ")); // Curso de desenvolvimento
	}
}
