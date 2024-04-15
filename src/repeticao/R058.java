package repeticao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia 20 números inteiros e, para cada número lido, imprima seus
 * divisores.
 * 
 * @author giovanebarcelos
 */

public class R058 {
	private static final int NUMEROSPARALER = 2;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		for (int conta = 1; conta <= NUMEROSPARALER; conta++) {
			System.out.print("\n" + conta + ") Número: ");
			long numero = ler.nextLong();

			System.out.printf("Os divisores de %d são: ", numero);
			for (long divisor = 1; divisor <= numero; divisor++) {
				if (numero % divisor == 0) {
					System.out.printf("%d ", divisor);
				}
			}
		}

		ler.close();
	}

}
