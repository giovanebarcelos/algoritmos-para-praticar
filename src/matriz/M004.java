package matriz;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler e imprimir uma matriz 3x4 de números inteiros.
 *
 * @author giovanebarcelos
 */

public class M004 {
	public static void main(final String[] args) {
		final Scanner ler = new Scanner(System.in);
		final int[][] matriz = new int[3][4];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = ler.nextInt();
			}
		}

		M004.imprimir(matriz);

		ler.close();
	}

	private static void imprimir(final int[][] matriz) {
		System.out.println("Conteúdo da matriz: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("matriz[%d][%d] = %d\n", linha, coluna, matriz[linha][coluna]);
			}
		}
	}
}