package subrotina;

import java.util.Scanner;

/*
 * Faça uma sub-rotina que calcule e retorne a soma de todos números pares de um intervalo
 * de números inteiros recebidos como parâmetros.
 *
 * @author giovanebarcelos
 */

public class SR003 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número Inicial: ");
		long numeroInicial = ler.nextLong();
		System.out.print("Número Final: ");
		long numeroFinal = ler.nextLong();

		long somaDosPares = SR003.somarParesDoIntervalo(numeroInicial, numeroFinal);

		System.out.printf("A soma dos pares entre %d e %d é %d\n", numeroInicial, numeroFinal, somaDosPares);

		ler.close();
	}

	public static long somarParesDoIntervalo(long numeroInicial, long numeroFinal) {
		long somaDosPares = 0;

		while (numeroInicial <= numeroFinal) {
			if ((numeroInicial % 2) != 0) {
				somaDosPares += numeroInicial;
			}
			numeroInicial++;
		}

		return somaDosPares;
	}
}