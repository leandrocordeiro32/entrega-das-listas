package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo16 {

	private String nome , ultimo , caracter13 , menosPrimeiro , doisUltimos;
	private char caracter1 , caracter4;
	
	public void imprimaNome() {
		
		nome = JOptionPane.showInputDialog(null, "Informe um nome: ", "SENAI Taguatinga", 3);
		
		if (nome.length() > 3) {
			
			caracter1 = nome.charAt(0);
			ultimo = nome.substring (nome.length() - 1);
			caracter13 = nome.substring(0 , 3);
			caracter4 = nome.charAt(3);
			menosPrimeiro = nome.substring(1);
			doisUltimos = nome.substring(nome.length() - 2);
			
			JOptionPane.showMessageDialog(null, "NOME: " + nome +
					"\nPRIMEIRO CHAR: " + caracter1 +
					"\nÚLTIMO CHAR: " + ultimo +
					"\nPRIMEIRO AO TERCEIRO CHAR: " + caracter13 +
					"\nQUARTO CHAR: " + caracter4 +
					"\nTODOS MENOS PRIMEIRO CHAR: " + menosPrimeiro +
					"\nDOIS ÚLTIMOS CHAR: " + doisUltimos, "SENAI Taguatinga", 1);
		} else {
			
			JOptionPane.showMessageDialog(null, "O nome deve ter mais de 3 caracteres!",
					"SENAI Taguatinga", 2);
		}
		
	}
}
