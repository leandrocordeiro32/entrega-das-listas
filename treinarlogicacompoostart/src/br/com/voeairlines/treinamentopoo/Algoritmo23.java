package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo23 {

	private String nome;
	private int idade;
	
	public void imprimaDados() {
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome completo", 
				"SENAI Taguatinga" , 3);
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade", 
				"SENAI Taguatinga" , 3));
		
		JOptionPane.showMessageDialog(null, String.format("<3 %s é uma lindah que tem %d aninhos! <3",
				nome , idade), "SENAI Taguatinga", 1);		
	}
}
