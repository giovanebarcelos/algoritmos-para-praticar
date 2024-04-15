package repeticao;

import java.util.Scanner;

/*
 * Faça um programa que leia um valor inteiro n e mostre os n primeiros números e seus quadrados.
 * Exemplo: n = 3, então apresentará 1, 4, 9.
 * 
 * @author giovanebarcelos
 */

public class R010 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número: ");
		long numero = ler.nextLong();

		for (int numeroAtual = 1; numeroAtual <= numero; numeroAtual++) {
			System.out.printf("O quadrado do numero %d é %d\n", numeroAtual, quadrado(numeroAtual));
		}

		ler.close();
	}

	private static long quadrado(long numero) {
		long somaImpares = 0, impar = 1;

		while (numero > 0) {
			somaImpares += impar;
			impar += 2;
			numero--;
		}

		return somaImpares;
	}
}