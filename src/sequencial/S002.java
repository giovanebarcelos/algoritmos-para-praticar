package sequencial;

import java.util.Scanner;

/*
 * Desenvolver um programa que leia dos valores e mostre o resto da divisão do primeiro
 * valor digitado pelo segundo e também a exponenciação do segundo pelo primeiro valor
 * lido.
 * 
 * @author giovanebarcelos 
 */
public class S002 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Valor 1:");
		double valor1 = ler.nextDouble();

		System.out.print("Valor 2:");
		double valor2 = ler.nextDouble();

		double restoDivisao = valor2 % valor2;
		System.out.printf("O resto da divisão de %.2f por %.2f é %.2f\n", valor1, valor2, restoDivisao);

		double expValor1PorValor2 = Math.pow(valor2, valor1);
		System.out.printf("A exponenciação de %.2f por %.2f é %.2f", valor2, valor1, expValor1PorValor2);

		ler.close();
	}
}
