package subrotina;

import java.util.Scanner;

/*
 * Faça uma função que recebe dois números inteiros e retorna o maior entre eles. Escreva
 * um algoritmo principal que teste esta função.
 *
 * @author giovanebarcelos
 */

public class SR007 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		long numero1 = ler.nextInt();
		System.out.print("Número 2: ");
		long numero2 = ler.nextInt();

		System.out.printf("\nO maior número entre %d e %d é %d\n", numero1, numero2,
				SR007.maiorNumero(numero1, numero2));

		ler.close();

	}

	private static long maiorNumero(long numero1, long numero2) {
		return numero1 > numero2 ? numero1 : numero2;
	}

}
