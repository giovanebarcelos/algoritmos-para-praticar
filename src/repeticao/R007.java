package repeticao;

import java.util.Scanner;

/*
 * Faça um programa que leia dois valores inteiros e apresente o números que estão entre
 * estes valores. Garanta que o primeiro valor lido seja menor que o segundo.
 * 
 * @author giovanebarcelos
 */

public class R007 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número Inicial: ");
		long numeroInicial = ler.nextLong();

		long numeroFinal = 0;
		do {
			System.out.print("Número Final: ");
			numeroFinal = ler.nextLong();

			if (numeroFinal < numeroInicial) {
				System.out.printf("Número Final deve ser maior ou igual ao Número Inicial (%d)!\n", numeroInicial);
			}
		} while (numeroFinal < numeroInicial);

		System.out.printf("\nNúmeros contidos no intervalo entre %d e %d:\n", numeroInicial, numeroFinal);
		while (numeroInicial <= numeroFinal) {
			System.out.println(numeroInicial);
			numeroInicial++;
		}

		ler.close();
	}

}
