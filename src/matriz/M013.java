package matriz;

import java.util.Scanner;

/*
 * Ler um vetor A de 15 números. Após, ler mais um número e guardar em uma variável X.
 * Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
 * Logo após, imprimir o vetor M.
 *
 * @author giovanebarcelos
 */

public class M013 {
	private static final int QTDENUMEROS = 15;

	public static void main(String[] args) {
		int[] vetorADeNumeros = M013.lerNumeros();

		Scanner ler = new Scanner(System.in);
		System.out.print("\n\nNúmero Multiplicador: ");
		int multiplicador = ler.nextInt();

		int[] vetorMultiplicado = M013.multiplicar(multiplicador, vetorADeNumeros);

		M013.imprimir("Vetor Original", vetorADeNumeros);
		M013.imprimir("Vetor Multiplicado", vetorMultiplicado);

		ler.close();
	}

	private static void imprimir(String nomeMatriz, int[] matriz) {

		System.out.println(nomeMatriz);
		for (int posicao = 0; posicao < matriz.length; posicao++) {
			System.out.printf("matriz[%d] = %d\n", posicao, matriz[posicao]);
		}

		System.out.println();
	}

	private static int[] multiplicar(int multiplicador, int[] vetorADeNumeros) {
		int[] vetorMultiplicado = new int[vetorADeNumeros.length];

		for (int posicao = 0; posicao < vetorADeNumeros.length; posicao++) {
			vetorMultiplicado[posicao] = vetorADeNumeros[posicao] * multiplicador;
		}
		return vetorMultiplicado;
	}

	private static int[] lerNumeros() {
		Scanner ler = new Scanner(System.in);

		int[] numeros = new int[M013.QTDENUMEROS];

		int posicao = 0;
		while (posicao < numeros.length) {
			System.out.print("Número " + (posicao + 1) + ": ");
			numeros[posicao] = ler.nextInt();

			posicao++;
		}

		ler.reset();

		return numeros;
	}
}