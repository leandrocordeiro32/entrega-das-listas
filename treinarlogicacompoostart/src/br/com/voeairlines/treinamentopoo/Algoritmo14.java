package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo14 {
	
	private double valor , saldo;
	
	public void saldoReajuste () {
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o saldo de sua conta",
				"SENAI Taguatinga", 3));
		
		saldo = valor + (valor * 0.01);
		
		JOptionPane.showMessageDialog(null, String.format("Saldo atualizado: R$ %.2f" , saldo), 
				"SENAI Taguatinga", 1);
		
	}

}
