package subrotina;

import java.util.Scanner;

/*
 * Faça um algoritmo, utilizando uma função recursiva, que eleve um número inteiro qualquer
 * a uma potência. Devem ser fornecidos o número e a potência no algoritmo principal.
 *
 * @author giovanebarcelos
 */

public class SR012 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número: ");
		long numero = ler.nextLong();
		System.out.print("Potência: ");
		long potencia = ler.nextLong();

		System.out.printf("%d elevado na %d é igual a %d", numero, potencia, SR012.potencia(numero, potencia));

		ler.close();
	}

	private static long potencia(long numero, long potencia) {
		if (potencia == 1) {
			return numero;
		}

		return numero * SR012.potencia(numero, potencia - 1);
	}

}
