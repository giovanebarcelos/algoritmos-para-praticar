package matriz;

import java.util.Scanner;

/*
 * Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir o
 * valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor.
 *
 * @author giovanebarcelos
 */

public class M011 {
	private static final int NROPOSICOES = 20;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[M011.NROPOSICOES];

		int posicaoMaiorNumero = 0;
		boolean primeiro = true;
		for (int posicao = 0; posicao < M011.NROPOSICOES; posicao++) {
			System.out.print("Número " + (posicao + 1) + ": ");
			numeros[posicao] = ler.nextInt();

			if (primeiro || (numeros[posicaoMaiorNumero] < numeros[posicao])) {
				primeiro = false;
				posicaoMaiorNumero = posicao;
			}
		}

		System.out.printf("O maior número é %d e esta na posição %d\n", numeros[posicaoMaiorNumero],
				posicaoMaiorNumero);

		ler.close();
	}
}