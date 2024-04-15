package decisao;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia dois valores inteiros e informe se o primeiro é divisível
 * pelo segundo valor lido ou se o segundo é divisível pelo primeiro.
 * 
 * @author giovanebarcelos
 */

public class C005 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		int numero1 = ler.nextInt();

		System.out.print("Número 2: ");
		int numero2 = ler.nextInt();

		if (numero1 % numero2 == 0) {
			System.out.printf("Número %d é divisível por %d", numero1, numero2);
		} else if (numero2 % numero1 == 0) {
			System.out.printf("Número %d é divisível por %d", numero2, numero1);
		} else {
			System.out.printf("Número %d e %d não são divisíveis entre si", numero1, numero2);
		}

		ler.close();
	}
}
