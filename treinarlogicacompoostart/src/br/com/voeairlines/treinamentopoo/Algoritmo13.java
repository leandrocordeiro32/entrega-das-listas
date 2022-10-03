package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo13 {
	
	private double numero1 , numero2 , numero3 , numero4 , mediaPond;
	
	public void mediaPonderada() {
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número qualquer: ",
				"SENAI Taguatinga", 3));
		
		numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro número qualquer: ",
				"SENAI Taguatinga", 3));
		
		numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe mais um número qualquer: ",
				"SENAI Taguatinga", 3));
		
		numero4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o último número: ",
				"SENAI Taguatinga", 3));
		
		mediaPond = ((numero1 * 1) + (numero2 * 2) + (numero3 * 3) + (numero4 * 4)) /
				(1 + 2 + 3 + 4);
		
		JOptionPane.showMessageDialog(null, "A média ponderada dos números " +
		numero1 + ", " + numero2 + ", " + numero3 + " e " + numero4 + " é igual a " +
				mediaPond + ".", "SENAI Taguatinga", 1);
	}

}
