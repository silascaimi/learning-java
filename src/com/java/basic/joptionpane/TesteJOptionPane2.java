package com.java.basic.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TesteJOptionPane2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {

		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		String[] opcoes = { "Sim", "N�o", "Sim, com e-mail" };

		int opcao = JOptionPane.showOptionDialog(null, "Voc� gostaria de finalizar o cadastro?", "Confirma��o",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);

		if (opcao == 0) {
			System.out.println(opcoes[0]);
		} else if (opcao == 1) {
			System.out.println(opcoes[1]);
		} else {
			System.out.println(opcoes[2]);
		}
	}
}
