package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo20 {

	private double ladoA , ladoB , ladoC , diagonal;
	
	public void infoParalelepipedo() {
		
		ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) do lado A do paralelepipedo: " ,
				"SENAI Taguatinga" , 3));
		
		ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) do lado B do paralelepipedo: " ,
				"SENAI Taguatinga" , 3));
		
		ladoC = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor (cm) do lado C do paralelepipedo: " ,
				"SENAI Taguatinga" , 3));
		
		diagonal = Math.sqrt((Math.pow(ladoA, 2) + Math.pow(ladoB, 2) + Math.pow(ladoC, 2)));
		
		JOptionPane.showMessageDialog(null, 
				String.format("O paralelepípedo com as medidas: A = %.2f cm,"
						+ " B = %.2f cm e C = %.2f cm possui:" + "\nDiagonal: %.2f cm",
						ladoA , ladoB , ladoC , diagonal));
	}
}
