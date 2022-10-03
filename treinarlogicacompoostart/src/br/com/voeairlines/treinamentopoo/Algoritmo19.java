package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo19 {

	private double lado , area , perimetro, diagonal;
	
	public void infoQuadrado() {
		
		lado = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) de um dos lados do quadrado: ", "SENAI Taguatinga", 3));
		
		area = Math.pow(lado, 2);
		perimetro = 4 * lado;
		diagonal = lado * (Math.sqrt(2));
		
		JOptionPane.showMessageDialog(null, 
				String.format("O quadrado com lados medindo %.2f cm possui:" +
						"\nPerímetro: %.2f cm" + "\nArea: %.2f cm" +
						"\nDiagonal: %.2f cm", lado , perimetro , area , diagonal));
	}
}
