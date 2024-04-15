package matriz;

import java.util.Scanner;

/*
 * Escreva um programa que leia uma matriz quadrada 5 x 5 de elementos reais e divida cada
 * elemento de uma linha da matriz pelo elemento da diagonal principal desta linha. Imprima
 * a matriz modificada.
 *
 * @author giovanebarcelos
 */

public class M009 {
	private static final int QTDEDELEMENTOS = 5;

	public static void main(String[] args) {
		double[][] matriz = new double[M009.QTDEDELEMENTOS][M009.QTDEDELEMENTOS];

		M009.lerMatriz(matriz);
		double[][] matrizModificada = M009.dividirElementosDaMatrizPeloElementoDaDiagonalPrincipal(matriz);
		M009.imprimir("Matriz", matrizModificada);
	}

	private static void imprimir(String nomeMatriz, double[][] matriz) {

		// Desenha Cabeçalho
		System.out.print(nomeMatriz);
		for (int coluna = 0; coluna < matriz.length; coluna++) {
			System.out.printf("%10d ", coluna);
		}

		// Desenha Linhas e Dados
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.printf("\n%" + nomeMatriz.length() + "d", linha);
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("%10.2f ", matriz[linha][coluna]);
			}
		}

		System.out.println();
	}

	private static double[][] dividirElementosDaMatrizPeloElementoDaDiagonalPrincipal(double[][] matriz) {
		double[][] matrizModificada = new double[matriz.length][matriz[0].length];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matrizModificada[linha][coluna] = matriz[linha][coluna] / matriz[linha][linha];
			}
		}

		return matrizModificada;
	}

	private static void lerMatriz(double[][] matriz) {
		Scanner ler = new Scanner(System.in);

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = ler.nextDouble();
			}
		}

		ler.close();
	}
}