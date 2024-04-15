package subrotina;

import java.util.Scanner;

/*
 * Faça uma sub-rotina do tipo função chamada de triplo que recebe um parâmetro inteiro e
 * retorna o triplo deste parâmetro. Escreve um algoritmo principal que leia um número
 * inteiro inicial e final. Depois mostre o triplo dos números do intervalo lido utilizando a
 * função desenvolvida.
 *
 * @author giovanebarcelos
 */

public class SR006 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número Inicial: ");
		long numeroInicial = ler.nextInt();
		System.out.print("Número Final: ");
		long numeroFinal = ler.nextInt();

		SR006.imprimirTriploDosNumerosDoIntervalo(numeroInicial, numeroFinal);

		ler.close();
	}

	private static void imprimirTriploDosNumerosDoIntervalo(long numeroInicial, long numeroFinal) {
		for (long numero = numeroInicial; numero <= numeroFinal; numero++) {
			System.out.printf("O triplo do número %d é %d\n", numero, numero * 3);
		}
	}
}