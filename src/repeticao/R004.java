package repeticao;

import java.util.Scanner;

/*
 * Faça um algoritmo que escreva todos os números múltiplos de 3 entre 1 e N, sendo N um
 * valor digitado pelo usuário.
 * 
 * @author giovanebarcelos
 */

public class R004 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número Final: ");
		long numeroFinal = ler.nextLong();

		for (int numero = 1; numero <= numeroFinal; numero++) {
			if (ehMultiploDeTres(numero)) {
				System.out.printf("O número %d é múltiplo de 3\n", numero);
			}
		}

		ler.close();
	}

	private static boolean ehMultiploDeTres(int numero) {
		return (numero % 3 == 0);
	}
}