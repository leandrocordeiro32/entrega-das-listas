package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo21 {

	private double base , altura , area;
	
	public void infoTriangulo() {
		
		base = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) da base do triângulo: ", "SENAI Taguatinga" , 3));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) da altura do triângulo: ", "SENAI Taguatinga" , 3));
		
		area = (base * altura) / 2;
		
		JOptionPane.showMessageDialog(null,
				String.format("O triângulo com base medindo %.2f cm e altura %.2f cm possui:" +
						"\nArea: %.2f cm", base , altura , area , "SENAI Taguatinga", 1));
	}
}
