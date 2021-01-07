package com.java.basic.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		// Elementos duplicados s�o ignorados
		// A ordem dos elementos � ordenada implementando a interface Comparable
		// Strings s�o ordendos em ordem alfab�tica
		
		Set<String> alunos = new TreeSet<>();
		
		alunos.add("Jo�o");
		alunos.add("Jos�");
		alunos.add("Maria");
		alunos.add("Pedro");
		alunos.add("Pedro");
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Set<String> alunos) {
		for (String a : alunos) {
			System.out.println(a);
		}
	}
}
