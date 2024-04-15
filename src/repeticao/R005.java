package repeticao;

import java.util.Scanner;

/*
 * Elabore um algoritmo que receba dois números inteiros positivos. Calcule e mostre:
 * a. Caso os números formem um intervalo crescente, a media dos números do intervalo,
 * incluindo os números digitados;
 * b. Caso os números formem um intervalo decrescente, a quantidade de números pares,
 * incluindo os números digitados;
 * c. Se os números forem iguais, mostrar uma mensagem.
 * 
 * @author giovanebarcelos
 */

public class R005 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número Inicial: ");
		long numeroInicial = ler.nextLong();
		System.out.print("Número Final: ");
		long numeroFinal = ler.nextLong();

		if (numeroInicial == numeroFinal) {
			System.out.println("Os números são iguais!");
		} else if (intervaloEhCrescente(numeroInicial, numeroFinal)) {
			System.out.printf("A média de %d até %d é %d", numeroInicial, numeroFinal,
					mediaDoIntervaloCrescrente(numeroInicial, numeroFinal));
		} else if (intervaloEhDecrescente(numeroInicial, numeroFinal)) {
			System.out.printf("A quantidade de pares entre %d e %d é %d", numeroInicial, numeroFinal,
					somaQtdeDeParesDoIntervaloDecrescente(numeroInicial, numeroFinal));
		}

		ler.close();
	}

	private static Long somaQtdeDeParesDoIntervaloDecrescente(long numeroInicial, long numeroFinal) {
		long qtdePares = 0;

		for (long numero = numeroInicial; numero >= numeroFinal; numero--) {
			if (numero % 2 == 0) {
				qtdePares++;
			}
		}

		return qtdePares;
	}

	private static Long mediaDoIntervaloCrescrente(long numeroInicial, long numeroFinal) {
		long somaDoIntervalo = 0;

		long numero = numeroInicial;
		while (numero <= numeroFinal) {
			somaDoIntervalo += numero;
			numero++;
		}

		return somaDoIntervalo / (numeroFinal - numeroInicial + 1);
	}

	private static boolean intervaloEhDecrescente(long numeroInicial, long numeroFinal) {
		return numeroInicial > numeroFinal;
	}

	private static boolean intervaloEhCrescente(long numeroInicial, long numeroFinal) {
		return numeroInicial < numeroFinal;
	}
}