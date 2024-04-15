package subrotina;

import java.util.Scanner;

/*
 * Desenvolva uma sub-rotina que calcule a soma de todos os números pares e números
 * impares de um intervalo de números inteiros recebidos como parâmetros utilizando os
 * algoritmos SR002 e SR003 desenvolvidos anteriormente. Faça um algoritmo principal
 * para testar esta sub-rotina.
 *
 * @author giovanebarcelos
 */

public class SR004 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número Inicial: ");
		long numeroInicial = ler.nextLong();
		System.out.print("Número Final: ");
		long numeroFinal = ler.nextLong();

		long somaDosParesEImpares = SR003.somarParesDoIntervalo(numeroInicial, numeroFinal)
				+ SR002.somarImparesDoIntervalo(numeroInicial, numeroFinal);

		System.out.printf("A soma dos pares e impares do intervalo de %d e %d é %d", numeroInicial, numeroFinal,
				somaDosParesEImpares);

		ler.close();
	}
}