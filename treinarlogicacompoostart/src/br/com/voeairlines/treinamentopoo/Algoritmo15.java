package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo15 {
	
	private double quilowatt , salarioMin , valorQuilowatt, valorPago, valorPagoDesconto;
	
	public void consumoEnergia() {
		
		salarioMin = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor do salário mínimo: ", "SENAI Taguatinga", 3));
		
		quilowatt = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe a quantidade de quilowatt gasta por residência: ", 
				"SENAI Taguatinga", 3));
		
		valorQuilowatt = (salarioMin / 7) / 100;
		
		valorPago = quilowatt * valorQuilowatt;
		
		valorPagoDesconto = valorPago - (valorPago * 0.1);
		
		JOptionPane.showMessageDialog(null, String.format("Salário Mínimo: R$ %.2f" +
				"\nQuilowatts consumidos: %.2f" +
				"\nValor de cada quilowatt: R$ %.2f" +
				"\nValor devido: R$ %.2f" +
				"\nValor com desconto: R$ %.2f" , 
				salarioMin, quilowatt, valorQuilowatt, valorPago, valorPagoDesconto), 
				"SENAI Taguatinga", 3);

		/*JOptionPane.showMessageDialog(null, "Salário Mínimo: R$ " + salarioMin +
				"\nQuilowatts consumidos: " + quilowatt +
				"\nValor de cada quilowatt: R$ " + valorQuilowatt +
				"\nValor a ser pago: R$ " + valorPago +
				"\nValor com desconto de 10%: R$ " + valorPagoDesconto, 
				"SENAI Taguatinga", 3);*/
	}

}
