package com.java.basic.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

import com.java.basic.collections.Aluno;

public class ExemploLinkedHashSet {
	
public static void main(String[] args) {
		
		// Elementos duplicados são ignorados
		// A ordem dos elementos permanece a mesma

		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("João");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Pedro");
		
		Set<Aluno> alunos = new LinkedHashSet<>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Set<Aluno> aluno) {
		for (Aluno a : aluno) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
