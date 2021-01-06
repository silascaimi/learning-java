package com.java.basic.interfaces;

public interface Automovel {

	void acelerar();
	void frear();
	
	
	// modificador default implementa o m�todo
	default void derrapar() {
		acelerar();
		acelerar();
		frear();
	}
	
	static int getVelocidadeMaxima() {
		return 300;
	}
}
