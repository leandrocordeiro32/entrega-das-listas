package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo24 {

	private double fahrenheit , celsius;
	private int opcao , continua;
	
	public void conversorTemp() {
		
		do {
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog
					(null, "Você está acessando o conversor de temperatura." +
							"\n\nPara converter Fahrenheit em Celsius, pressione 1." +
							"\nPara converter Celsius em Fahrenheit, pressione 2." , 
							"Conversor de temperatura" , 3));
			
			switch(opcao) {
			
			case 1:
				
				fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, 
						"Informe a temperatura em Fahrenheit: " , "Conversor de temperatura", 3));
				celsius = (5 * (fahrenheit - 32)/9);
				
				JOptionPane.showMessageDialog(null,
						String.format("A temperatura em Celsius é %.2f graus Celsius", celsius) ,
						"Conversor de temperatura" , 1);
				
				break;
				
			case 2:
				
				celsius = Double.parseDouble(JOptionPane.showInputDialog(null, 
						"Informe a temperatura em Celsius: " , "Conversor de temperatura", 3));
				
				fahrenheit = (celsius * 1.8) + 32;
				
				JOptionPane.showMessageDialog(null,
						String.format("A temperatura em Fahrenheit é %.2f graus Fahrenheit", fahrenheit) ,
						"Conversor de temperatura" , 1);
				
			break;
			
			default:
				
				JOptionPane.showMessageDialog(null, "Opção Inválida");

				
			}
			
			continua = JOptionPane.showConfirmDialog (null, "Deseja converter outra temperatura?", 
					"Conversor de temperatura", JOptionPane.YES_NO_OPTION);

		} while (continua == JOptionPane.YES_OPTION);
		
	}
	
}






