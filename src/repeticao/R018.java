package repeticao;

import java.util.Scanner;

/*
 * Sem utilizar a operação de multiplicação, escreva um algoritmo que multiplique dois
 * números inteiros (positivos). Ler os dois números e imprimir o resultado na forma:
 * Por exemplo: 7 * 3 = 21
 * 
 * @author giovanebarcelos
 */

public class R018 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Multiplicando: ");
		long multiplicando = ler.nextLong();

		System.out.print("Multiplicador: ");
		long multiplicador = ler.nextLong();

		long resultado = multiplicar(multiplicando, multiplicador);

		System.out.printf("%d * %d = %d", multiplicando, multiplicador, resultado);

		ler.close();
	}

	private static long multiplicar(long multiplicando, long multiplicador) {
		long resultado = 0;

		while (multiplicando > 0) {
			resultado += multiplicador;
			multiplicando--;
		}

		return resultado;
	}
}