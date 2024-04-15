package repeticao;

import java.util.Scanner;

/*
 * Faça um programa que calcule e mostre a tabuada de um número digitado pelo usuário.
 * 
 * @author giovanebarcelos
 */

public class R019 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número: ");
		long numero = ler.nextInt();

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.printf("%d x %d = %d\n", numero, multiplicador, numero * multiplicador);
		}

		ler.close();
	}
}