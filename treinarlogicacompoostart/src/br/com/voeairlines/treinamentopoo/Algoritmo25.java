package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo25 {
	
	private double raio , altura , volume;
	
	public void volumeLata() {
		
		raio = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe a medida (cm) do raio da lata de óleo: ", "SENAI Taguatinga", 3));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe a medida (cm) da altura da lata de óleo: ", "SENAI Taguatinga", 3));
		
		volume = Math.PI * Math.pow(raio, 2) * altura;
		
		JOptionPane.showMessageDialog(null, String.format("A lata de óleo com as medidas"
				+ " Raio = %.2f cm e Altura = %.2f cm tem a capacidade volumétrica de %.2f cm³.",
				raio, altura, volume), "SENAI Taguatinga", 1);
	}

}
