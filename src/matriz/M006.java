package matriz;

/*
 * Dado uma matriz quadrada de ordem 3 faça um algoritmo que verifique se a matriz é simétrica (aij=aji).
 *
 * @author giovanebarcelos
 */

public class M006 {
	public static void main(String[] args) {
		int[][] matriz1 = { { 3, 1, 2 }, { 1, 4, 3 }, { 2, 3, 5 } };
		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		String nomeMatriz = "Matriz Um";

		M006.desenhar(nomeMatriz, matriz1);
		if (M006.ehSimetrica(matriz1)) {
			System.out.printf("%s é Simétrica!\n", nomeMatriz);
		} else {
			System.out.printf("%s não é Simétrica!\n", nomeMatriz);
		}

		System.out.println();

		nomeMatriz = "Matriz Dois";
		M006.desenhar(nomeMatriz, matriz2);
		System.out.printf("%s %sé Simétrica!\n", nomeMatriz, M006.ehSimetrica(matriz2) ? "" : "não ");
	}

	private static void desenhar(String nomeMatriz, int[][] matriz) {

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

	private static boolean ehSimetrica(int[][] matriz) {
		boolean simetrica = true;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; simetrica && (coluna < matriz.length); coluna++) {
				simetrica = simetrica && (matriz[linha][coluna] == matriz[coluna][linha]);
			}
		}

		return simetrica;
	}
}