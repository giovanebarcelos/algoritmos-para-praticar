package subrotina;

import java.util.Scanner;

/*
 * Faça uma sub-rotina que calcule e retorne a soma de todos números impares de um
 * intervalo de números inteiros recebidos como parâmetros.
 *
 * @author giovanebarcelos
 */

public class SR002 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número Inicial: ");
		long numeroInicial = ler.nextLong();
		System.out.print("Número Final: ");
		long numeroFinal = ler.nextLong();

		long somaDosImpares = SR002.somarImparesDoIntervalo(numeroInicial, numeroFinal);

		System.out.printf("A soma dos impares entre %d e %d é %d\n", numeroInicial, numeroFinal, somaDosImpares);

		ler.close();
	}

	public static long somarImparesDoIntervalo(long numeroInicial, long numeroFinal) {
		long somaDosImpares = 0;

		while (numeroInicial <= numeroFinal) {
			if ((numeroInicial % 2) != 0) {
				somaDosImpares += numeroInicial;
			}
			numeroInicial++;
		}

		return somaDosImpares;
	}
}