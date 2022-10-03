package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo17 {

	private double base , altura , perimetro , area , diagonal;
	
	public void infoRetangulo() {
		
		base = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) da base do retângulo", "SENAI Taguatinga", 3));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor da altura (cm) do retângulo", "SENAI Taguatinga", 3));
		
		perimetro = 2 * (base + altura);
		area = base * altura;
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		JOptionPane.showMessageDialog(null, "O retângulo com base " + base + " cm e altura " +
		altura + " cm possui: " + "\nPerímetro: " + perimetro + " cm" + "\nArea: " + area + " cm²" +
		"\nDiagonal: " + diagonal + " cm", "SENAI Taguatinga", 1);
	}
}
