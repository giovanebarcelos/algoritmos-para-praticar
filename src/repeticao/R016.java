package repeticao;

import java.util.Scanner;

/*
 * Construa um algoritmo que, para um grupo de N valores inteiros lidos, determine:
 * - a soma dos números ÍMPARES;
 * - a quantidade de valores PARES;
 * - quando N for igual a 0 o programa deve parar de ler os valores
 * 
 * @author giovanebarcelos
 */

public class R016 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		long numero, qtdePares = 0, somaImpares = 0;
		while (true) {
			System.out.print("Número: ");
			numero = ler.nextLong();

			if (numero == 0) {
				break;
			}

			if (ehPar(numero)) {
				qtdePares++;
			} else {
				somaImpares += numero;
			}
		}

		System.out.println("Estatística dos Números: ");
		System.out.printf("Soma dos ímpares = %d\n", somaImpares);
		System.out.printf("Quantidade de pares = %d\n", qtdePares);

		ler.close();
	}

	private static boolean ehPar(long numero) {
		return numero % 2 == 0;
	}
}