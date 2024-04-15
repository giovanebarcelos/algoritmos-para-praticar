package matriz;

import java.util.Scanner;

/*
 * O mesmo exercício anterior (M011), mas agora deve escrever o menor elemento do vetor
 * e a respectiva posição dele nesse vetor.
 *
 * @author giovanebarcelos
 */

public class M012 {
	private static final int NROPOSICOES = 20;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[M012.NROPOSICOES];

		int posicaoMenorNumero = 0;
		boolean primeiro = true;
		for (int posicao = 0; posicao < M012.NROPOSICOES; posicao++) {
			System.out.print("Número " + (posicao + 1) + ": ");
			numeros[posicao] = ler.nextInt();

			if (primeiro || (numeros[posicaoMenorNumero] > numeros[posicao])) {
				primeiro = false;
				posicaoMenorNumero = posicao;
			}
		}

		System.out.printf("O menor número é %d e esta na posição %d\n", numeros[posicaoMenorNumero],
				posicaoMenorNumero);

		ler.close();
	}
}