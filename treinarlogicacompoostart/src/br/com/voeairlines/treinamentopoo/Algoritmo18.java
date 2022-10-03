package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo18 {

	private double raio , diametro, area , perimetro;
	
	public void infoCirculo() {
		
		raio = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) do raio de um círculo: ", "SENAI Taguatinga", 3));
		
		diametro = raio * 2;

		perimetro = Math.PI * diametro;

		area = (Math.PI) * (Math.pow(raio, 2));
		
		JOptionPane.showMessageDialog(null, 
				String.format("O círculo com raio %.2f cm e diâmetro %.2f cm possui: " + 
						"\nPerímetro: %.2f cm" + "\nArea: %.2f cm²" , 
						raio , diametro , perimetro , area), "SENAI Taguatinga", 1);
		
	}
}
