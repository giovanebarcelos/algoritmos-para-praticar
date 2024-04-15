package subrotina;

/*
 * Faça uma algoritmo que preencha uma matriz de terceira ordem (3x3) com a
 * multiplicação da sua linha e coluna (i*j). Escreva uma função que some todos os
 * elementos de uma matriz. Esta função deve receber como como parâmetro a dimensão da
 * matriz e deve retornar a total da soma. Por fim o algoritmo principal deve mostrar a soma
 * total.
 *
 * @author giovanebarcelos
 */

public class SR018 {
	private static final int TERCEIRAORDEM = 3;

	public static void main(String[] args) {
		long[][] matriz = SR018.matrizPreenchidaDeTerceiraOrdem();

		long somaDosElementos = SR018.somarElementos(matriz);

		System.out.printf("\nA soma dos elementos da matriz é %d\n", somaDosElementos);
	}

	private static long somarElementos(long[][] matriz) {
		long somaDosElementos = 0;

		for (long[] primeiroDimensao : matriz) {
			for (long elemento : primeiroDimensao) {
				somaDosElementos += elemento;
			}
		}

		return somaDosElementos;
	}

	private static long[][] matrizPreenchidaDeTerceiraOrdem() {
		long[][] matriz = new long[SR018.TERCEIRAORDEM][SR018.TERCEIRAORDEM];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = linha * coluna;
			}
		}

		return matriz;
	}
}