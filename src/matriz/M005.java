package matriz;

/*
 * Dado uma matriz de ordem 4x4 faça um algoritmo que:
 * a) Calcule a soma dos elementos da primeira coluna ;
 * b) Calcule o produto dos elementos da primeira linha;
 * c) Calcule a soma de todos os elementos da matriz;
 * d) Calcule a soma do diagonal principal;
 * e) Calcule a soma da diagonal secundária.
 *
 * @author giovanebarcelos *
 */

public class M005 {
	public static void main(final String[] args) {
		final long[][] matriz4x4 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		long somaElementosPrimeiraColuna = 0, produtoElementosDaPrimeiraLinha = 1, somaTodosElementosDaMatriz = 0,
				somaDaDiagonalPrincipal = 0, somaDaDiagonalSecundaria = 0;
		for (int linha = 0; linha < matriz4x4.length; linha++) {
			for (int coluna = 0; coluna < matriz4x4[linha].length; coluna++) {
				if (coluna == 0) {
					somaElementosPrimeiraColuna += matriz4x4[linha][coluna];
				}

				if (linha == 0) {
					produtoElementosDaPrimeiraLinha *= matriz4x4[linha][coluna];
				}

				somaTodosElementosDaMatriz += matriz4x4[linha][coluna];

				if (linha == coluna) {
					somaDaDiagonalPrincipal += matriz4x4[linha][coluna];
				}

				if ((linha + coluna) == (matriz4x4.length - 1)) {
					somaDaDiagonalSecundaria += matriz4x4[linha][coluna];
				}
			}
		}

		System.out.printf("Soma dos elementos da primeira coluna = %d\n", somaElementosPrimeiraColuna);
		System.out.printf("Produto dos elementos da primeira linha = %d\n", produtoElementosDaPrimeiraLinha);
		System.out.printf("Soma de todos os elementos da matriz = %d\n", somaTodosElementosDaMatriz);
		System.out.printf("Soma do diagonal principal = %d\n", somaDaDiagonalPrincipal);
		System.out.printf("Soma da diagonal secundária = %d\n", somaDaDiagonalSecundaria);
	}
}