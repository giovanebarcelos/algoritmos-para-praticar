package repeticao;

import java.util.Scanner;

/*
 * Construa um algoritmo para ler 10 (dez) números quaisquer fornecidos pelo usuário.
 * Calcular e mostrar:
 * - quantos são positivos;
 * - quantos são negativos;
 * - quantos são nulos (zero);
 * - a média aritmética de todos os números;
 * - a soma dos números positivos.
 * 
 * @author giovanebarcelos
 */

public class R015 {
	private static final int QTDENUMEROS = 10;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		long numero, somaNumeros = 0, somaPositivos = 0, contaZeros = 0, contaNegativos = 0, contaPositivos = 0;

		for (int conta = 1; conta <= QTDENUMEROS; conta++) {
			System.out.print("Número " + conta + ": ");
			numero = ler.nextLong();

			if (numero == 0) {
				contaZeros++;
			} else if (numero < 0) {
				contaNegativos++;
			} else {
				somaPositivos += numero;
				contaPositivos++;
			}

			somaNumeros += numero;
		}

		System.out.println("Estatística dos números: ");
		System.out.printf("Quantidade de Positivos: %d\n", contaPositivos);
		System.out.printf("Quantidade de Negativos: %d\n", contaNegativos);
		System.out.printf("Quantidade de Nulos (Zeros): %d\n", contaZeros);
		System.out.printf("Média: %.2f\n", somaNumeros / (float) (contaNegativos + contaPositivos + contaZeros));
		System.out.printf("Soma dos Positivos: %d\n", somaPositivos);

		ler.close();
	}
}