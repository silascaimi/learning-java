package com.java.basic.enums.naipe;

public enum Naipe {

	OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");

	private String cor;

	Naipe(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}
}
