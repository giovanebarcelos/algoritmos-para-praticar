package matriz;

/*
 * Desenvolva um algoritmo que some duas matrizes 3x3 e coloque o resultado numa
 * terceira matriz.
 *
 * @author giovanebarcelos
 */

public class M008 {
	public static void main(String[] args) {
		long matriz1[][] = new long[3][3], matriz2[][] = new long[3][3];

		M008.preencherAutomaticamenteMatriz(matriz1);
		M008.preencherAutomaticamenteMatriz(matriz2);

		long[][] matrizSomada = M008.somar(matriz1, matriz2);

		M008.desenhar("Matriz Um    ", matriz1);
		M008.desenhar("Matriz Dois  ", matriz2);
		M008.desenhar("Matriz Somada", matrizSomada);
	}

	private static long[][] somar(long[][] matriz1, long[][] matriz2) {
		long[][] matrizSomada = new long[matriz1.length][matriz1[0].length];

		for (int linha = 0; linha < matrizSomada.length; linha++) {
			for (int coluna = 0; coluna < matrizSomada[linha].length; coluna++) {
				matrizSomada[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
			}
		}

		return matrizSomada;
	}

	private static void preencherAutomaticamenteMatriz(long[][] matriz) {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = (linha + 1) * (coluna + 1);
			}
		}
	}

	private static void desenhar(String nomeMatriz, long[][] matriz) {

		// Desenha Cabeçalho
		System.out.print(nomeMatriz);
		for (int coluna = 0; coluna < matriz.length; coluna++) {
			System.out.printf("%4d ", coluna);
		}

		// Desenha Linhas e Dados
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.printf("\n%" + nomeMatriz.length() + "d", linha);
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("%4d ", matriz[linha][coluna]);
			}
		}

		System.out.println();
	}

}