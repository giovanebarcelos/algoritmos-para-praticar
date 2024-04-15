package sequencial;

import java.util.Scanner;

/*
 * Faça um algoritmo que receba o valor de um depósito e o valor da taxa de juros (em %).
 * Calcule e imprima o valor do rendimento e o valor total depois do rendimento.
 * 
 * @author giovanebarcelos  
 */

public class S013 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Valor Depósito: ");
		double valorDeposito = ler.nextDouble();

		System.out.print("Taxa de Juros em %: ");
		float taxaJuros = ler.nextFloat();

		double valorRendimento = valorDeposito * (taxaJuros / 100);
		System.out.printf("Valor Rendimento = %.2f\n", valorRendimento);

		double valorTotal = valorDeposito + valorRendimento;
		System.out.printf("Valor Total = %.2f\n", valorTotal);

		ler.close();
	}
}
