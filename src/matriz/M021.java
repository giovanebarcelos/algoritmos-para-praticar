package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler um vetor de 20 números. Após isto, ler mais um número
 * qualquer, calcular e escrever quantas vezes esse número aparece no vetor.
 *
 * @author giovanebarcelos
 */

public class M021 {
	private static final int TAMANHO = 20;

	public static void main(String[] args) {
		int[] numeros = M021.lerNumeros();

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número para pesquisar: ");
		int numero = ler.nextInt();

		int conta = M021.contarRepeticoes(numero, numeros);

		System.out.printf("O número %d repetiu %d vezes no vetor!", numero, conta);

		ler.close();
	}

	private static int contarRepeticoes(int numero, int[] numeros) {
		int conta = 0;

		for (int numeroVetor : numeros) {
			if (numeroVetor == numero) {
				conta++;
			}
		}

		return conta;
	}

	private static int[] lerNumeros() {
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[M021.TAMANHO];

		for (int posicao = 0; posicao < M021.TAMANHO; posicao++) {
			System.out.print("Número " + (posicao + 1) + ": ");
			numeros[posicao] = ler.nextInt();
		}

		ler.reset();

		return numeros;
	}

}