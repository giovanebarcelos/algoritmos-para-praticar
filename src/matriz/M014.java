package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler 20 números e armazenar em um vetor. Após a leitura total dos
 * 20 números, o algoritmo deve escrever esses 20 números lidos na ordem inversa.
 *
 * @author giovanebarcelos
 */

public class M014 {
	private static final int QTDENUMEROS = 20;

	public static void main(String[] args) {
		int[] numeros = M014.lerNumeros();

		M014.imprimirNumerosEmOrdemInversa(numeros);

	}

	private static void imprimirNumerosEmOrdemInversa(int[] numeros) {
		System.out.print("Números em Ordem Inversa: ");

		int posicao = numeros.length - 1;
		while (posicao > -1) {
			System.out.printf("%d ", numeros[posicao]);
			posicao--;
		}
	}

	private static int[] lerNumeros() {
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[M014.QTDENUMEROS];

		for (int posicao = 0; posicao < M014.QTDENUMEROS; posicao++) {
			System.out.print("Número " + (posicao + 1) + ": ");
			numeros[posicao] = ler.nextInt();
		}

		ler.close();

		return numeros;
	}
}