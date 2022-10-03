package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo02 {
	
	private String nome;
	
	public void imprimaNome() {
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome: ", "SENAI Taguatinga", 3);
		
		JOptionPane.showMessageDialog(null, "Olá " + nome + ", espero que esteja bem!",
				"SENAI Taguatinga", 1);
	}

}
