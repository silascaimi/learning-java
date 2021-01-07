package com.java.basic.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.java.basic.collections.Aluno;

public class ExemploList {

	public static void main(String[] args) {

		// Pode haver elementos duplicados

		Aluno a1 = new Aluno("Jos�");
		Aluno a2 = new Aluno("Jo�o");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Pedro");

		List<Aluno> alunos = new ArrayList<>();

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);

		// Tamanho da lista
		System.out.println(alunos.size());

		imprimirAlunos(alunos);

		// Cria uma lista imut�vel Java9
		List<Aluno> lista = List.of(a1, a2);

		imprimirAlunos(lista);
	}

	public static void imprimirAlunos(List<Aluno> alunos) {

		// Usando o enhanced-for
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}

		// Usando o iterator
		Iterator<Aluno> iterator = alunos.iterator();

		while (iterator.hasNext()) {
			Aluno aluno = iterator.next();
			System.out.println(aluno.getNome());

		}

	}

}
