package matriz;

import java.util.Scanner;

/*
 * Dado uma matriz quadrada de ordem 3 de valores reais faça um algoritmo que faça a
 * leitura destes valores e ao final da leitura de todos, imprimirem os seguintes relatórios:
 * a) Qual a Soma dos valores de cada coluna da matriz;
 * b) Listar os valores que são menores que a média dos valores;
 * c) Qual a soma dos elementos da diagonal secundária;
 *
 * @author giovanebarcelos
 */

public class M007 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double[][] matriz = new double[3][3];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("Digite um valor para matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = ler.nextDouble();
			}
		}

		M007.imprimirSomaDosValoresDasColunas(matriz);
		M007.imprimirValoresMenoresQueAMediaDosValores(matriz);

		System.out.printf("Soma dos elementos da diagonal secundária = %.2f\n",
				M007.somaElementosDiagonalSecundaria(matriz));

		ler.close();
	}

	private static void imprimirSomaDosValoresDasColunas(double[][] matriz) {
		System.out.println("Soma dos Valores Das Colunas: ");

		int contaColuna = 0;
		for (double[] linha : matriz) {
			double somaValoresDaColuna = 0;
			for (double valor : linha) {
				somaValoresDaColuna += valor;
			}

			System.out.printf("Total da coluna %d = %.2f\n", contaColuna, somaValoresDaColuna);
			contaColuna++;
		}
		System.out.println();
	}

	private static void imprimirValoresMenoresQueAMediaDosValores(double[][] matriz) {
		double mediaDosValores = M007.mediaDosValores(matriz);

		System.out.printf("Valores menores que a média de todos os valores (%.2f)\n", mediaDosValores);
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (matriz[linha][coluna] < mediaDosValores) {
					System.out.printf("matriz[%d][%d] = %.2f\n", linha, coluna, matriz[linha][coluna]);
				}
			}
		}

		System.out.println();
	}

	private static double mediaDosValores(double[][] matriz) {
		double somaDosValores = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somaDosValores += matriz[linha][coluna];
			}
		}

		return somaDosValores / (matriz.length * matriz[0].length);
	}

	private static double somaElementosDiagonalSecundaria(double[][] matriz) {
		double somaDiagonalSecundaria = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if ((linha + coluna) == (matriz.length - 1)) {
					somaDiagonalSecundaria += matriz[linha][coluna];
				}
			}
		}

		return somaDiagonalSecundaria;
	}
}