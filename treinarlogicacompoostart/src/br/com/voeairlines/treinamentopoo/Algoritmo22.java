package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo22 {

	private double maiorD , menorD , area;
	
	public void infoLosango() {
		
		maiorD = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe a medida (cm) da diagonal maior do losango: ", "SENAI Taguatinga", 3));
		
		menorD = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe a medida (cm) da diagonal menor do losango: ", "SENAI Taguatinga", 3));
		
		do {
			
			JOptionPane.showMessageDialog(null, 
					"Medida do lado maior é menor que a medida do lado menor");
			
			maiorD = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe a medida (cm) da diagonal maior do losango: ", "SENAI Taguatinga", 3));
			
			menorD = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe a medida (cm) da diagonal menor do losango: ", "SENAI Taguatinga", 3));
			
		} while (maiorD < menorD);
			
			area = (maiorD * menorD) / 2;
			
			JOptionPane.showMessageDialog(null, 
					String.format("O losango com as medidas diagonais: " +
							"Maior = %.2f cm e Menor %.2f cm possui:" +
							"\nArea: %.2f cm", maiorD , menorD , area), "SENAI Taguatinga", 1);
	}
}
