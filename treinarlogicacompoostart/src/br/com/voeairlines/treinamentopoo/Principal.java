package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int continua;
		//JOptionPane.showInputDialog("Escolha uma opção de 1 a 26: ");
		
		do {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Escolha uma opção de 1 a 26: " , "LISTA DE EXERCÍCIO 1" , 1));
		
		switch(opcao) {
		
		case 1:
			
			/*Algoritmo01 alg1 = new Algoritmo01();
			System.out.print("Resultado: " + alg1.imprimirMensagem());*/
			
			new Algoritmo01().imprimirMensagem();
			
			break;
			
		case 2:
			
			new Algoritmo02().imprimaNome();
			
			break;
			
		case 3:
			
			new Algoritmo03().imprimeProduto();
			
			break;
			
		case 4:
			
			new Algoritmo04().imprimeMedia();
			
			break;
			
		case 5:
			
			new Algoritmo05().imprimaNumero();

			break;
			
		case 6:
			
			new Algoritmo06().imprimaNumero();
			
			break;
		
		case 7:
			
			new Algoritmo07().imprimaNumeros();
			
			break;
			
		case 8:
			
			new Algoritmo08().imprimeDados();
			
			break;
			
		case 9:
			
			new Algoritmo09().imprimaSoma();
			
			break;
			
		case 10:
			
			new Algoritmo10().imprimaProduto();
			
			break;
			
		case 11:
			
			new Algoritmo11().tercaParte();
			
			break;
			
		case 12:
			
			new Algoritmo12().imprimaMedia();
			
			break;
			
		case 13:
			
			new Algoritmo13().mediaPonderada();
			
			break;
			
		case 14:
			
			new Algoritmo14().saldoReajuste();
			
			break;
			
		case 15:
			
			new Algoritmo15().consumoEnergia();
			
			break;
			
		case 16:
			
			new Algoritmo16().imprimaNome();
			
			break;
			
		case 17:
			
			new Algoritmo17().infoRetangulo();
			
			break;
			
		case 18:
			
			new Algoritmo18().infoCirculo();
			
			break;
			
		case 19:
			
			new Algoritmo19().infoQuadrado();
			
			break;
			
		case 20:
			
			new Algoritmo20().infoParalelepipedo();
			
			break;
			
		case 21:
			
			new Algoritmo21().infoTriangulo();
			
			break;
			
		case 22:
			
			new Algoritmo22().infoLosango();
			
			break;
			
		case 23:
			
			new Algoritmo23().imprimaDados();
			
			break;
			
		case 24:
			
			new Algoritmo24().conversorTemp();
			
			break;
			
		case 25:
			
			new Algoritmo25().volumeLata();
			
			break;
			
		case 26:
			
			new Algoritmo26().calculaPrestacao();
			
			break;
			
			default:
				
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			
		}
		
		continua = JOptionPane.showConfirmDialog (null, "Deseja escolher outra opção?", "SENAI Taguatinga", JOptionPane.YES_NO_OPTION);
		
		} while (continua == JOptionPane.YES_OPTION);
		
		sc.close();
	}

}
