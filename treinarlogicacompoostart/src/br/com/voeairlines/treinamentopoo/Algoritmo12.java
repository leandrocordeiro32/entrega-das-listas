package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo12 {
	
	private double numero1 , numero2 , media;
	
	public void imprimaMedia() {
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número qualquer: ",
				"SENAI Taguatinga", 3));
		
		numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro número qualquer: ",
				"SENAI Taguatinga", 3));
		
		media = (numero1 + numero2) / 2;
		
		JOptionPane.showMessageDialog(null, "A média aritmética dos números " + numero1 + " e " +
		numero2 + " é igual a " + media + ".", "SENAI Taguatinga", 1);
	}

}
