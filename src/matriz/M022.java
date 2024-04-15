package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler 30 números e armazenar em um vetor, verificar e escrever se
 * existem números repetidos no vetor e em que posições se encontram.
 *
 * @author giovanebarcelos
 */

public class M022 {
	private static final int TAMANHO = 10;

	public static void main(String[] args) {
		int[] numeros = M022.lerNumeros();

		M022.imprimirNumerosRepetidos(numeros);

	}

	private static void imprimirNumerosRepetidos(int[] numeros) {
		boolean[] numeroImpresso = new boolean[numeros.length];

		for (int posicao = 0; posicao < numeros.length; posicao++) {
			if (!numeroImpresso[posicao] && (M022.contarRepeticaoDoNumeroNoVetor(numeros[posicao], numeros) > 1)) {

				System.out.printf("\nNúmero %d repetido nas posições: ", numeros[posicao]);
				for (int repetido = 0; repetido < numeros.length; repetido++) {
					if (numeros[posicao] == numeros[repetido]) {
						numeroImpresso[repetido] = true;
						System.out.printf("%d ", repetido);
					}
				}
			}
		}
	}

	private static int contarRepeticaoDoNumeroNoVetor(int numero, int[] numeros) {
		int conta = 0;

		for (int numeroVetor : numeros) {
			if (numero == numeroVetor) {
				conta++;
			}
		}

		return conta;
	}

	private static int[] lerNumeros() {
		Scanner ler = new Scanner(System.in);

		int[] numeros = new int[M022.TAMANHO];
		for (int posicao = 0; posicao < M022.TAMANHO; posicao++) {
			System.out.print("Número " + (posicao + 1) + " (posição " + posicao + "): ");
			numeros[posicao] = ler.nextInt();
		}

		ler.close();

		return numeros;
	}
}