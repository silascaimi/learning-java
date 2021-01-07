package com.java.basic.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.java.basic.collections.Aluno;

import java.util.Set;

public class ExemploHashMap {

	public static void main(String[] args) {

		// N�o garante mesma ordem de inser��o

		Aluno a1 = new Aluno("Jos�");
		Aluno a2 = new Aluno("Jo�o");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("Pedro");

		Map<String, Aluno> alunos = new HashMap<>();

		// Garante mesma ordem de inser��o
		// Map<String, Aluno> alunos2 = new LinkedHashMap<>();

		// Garante ordena��o em ordem crescente
		// Map<String, Aluno> alunos2 = new TreeMap<>();

		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);

		imprimirAlunos(alunos);

		System.out.println();

		System.out.println("Aluno id 2: " + alunos.get("2").getNome());

		System.out.println();

		// Lista chaves - Retorna um Set
		Set<String> chaves = alunos.keySet();
		for (String string : chaves) {
			System.out.println(string);
		}

		System.out.println();

		// Lista valores - retorna um Collection
		Collection<Aluno> alunos2 = alunos.values();
		for (Aluno a : alunos2) {
			System.out.println(a.getNome());
		}

		System.out.println();

		// Lista chaves e valores - retorna um Set de objetos Map.Entry
		Set<Map.Entry<String, Aluno>> alunos3 = alunos.entrySet();
		for (Entry<String, Aluno> aluno : alunos3) {
			System.out.println("Chave: " + aluno.getKey() + " Valor: " + aluno.getValue().getNome());
		}

		System.out.println();

		// Mapas imut�veis Java9
		// Op���o 1
		Map<Integer, String> map1 = Map.of(1, "A", 2, "B");
		for (String string : map1.values()) {
			System.out.println(string);
		}

		System.out.println();

		// Op��o 2
		Map<Integer, String> map2 = Map.ofEntries(Map.entry(1, "A"), Map.entry(2, "B"), Map.entry(3, "C"));
		for (String string : map2.values()) {
			System.out.println(string);
		}

	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
