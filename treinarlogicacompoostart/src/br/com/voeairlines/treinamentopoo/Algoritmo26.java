package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo26 {
	
	private double valor , taxa , prestacao, porcento;
	private int tempo;
		
		public void calculaPrestacao() {
			
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe o valor da prestação em atraso", "Prestação em atraso", 3));
			
			taxa = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe a taxa de juros e multa", "Prestação em atraso", 3));
			porcento = taxa / 100;
			
			tempo = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Informe os dias de atraso", "Prestação em atraso", 3));
			
			prestacao = valor +(valor * porcento * tempo);
			
			JOptionPane.showMessageDialog(null, 
					String.format("VALOR DA PRESTAÇÃO: R$ %.2f" +
								"\nTAXA DE JUROS E MULTA: %.2f por cento" +
								"\nDIAS DE ATRASO: %d" +
								"\nVALOR DA PRESTAÇÃO CORRIGIDO: R$ %.2f" ,
								valor , taxa , tempo , prestacao) , "Prestação em atraso" , 1);
		}


}
