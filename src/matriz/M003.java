package matriz;

/*
 * Faça um algoritmo para zerar toda matriz 13x15.
 * 
 * @author giovanebarcelos
 */

public class M003 {
	public static void main(String[] args) {
		int[][] matriz = new int[13][15];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = 0;
			}
		}
	}
}