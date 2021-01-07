package com.java.basic.collections.comparablecomparator;

import java.util.Comparator;

import com.java.basic.collections.equalshashcode.Produto;

public class TesteComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {

		// Insere os criterios para ordenacao
		// retornar zero faz com que não haja itens duplicados
		// ao retornar 1 permitir manter itens com o mesmo titulo na lista
		if (o1.getTitulo() == o2.getTitulo()) {
			return 1;
		}

		if (o1.getTitulo().compareTo(o2.getTitulo()) > 1) {
			return 1;
		}

		return -1;

	}
}
