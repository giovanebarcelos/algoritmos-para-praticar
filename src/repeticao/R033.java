package repeticao;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler uma quantidade e a seguir ler esta quantidade de números.
 * Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números
 * lidos e a média dos números lidos.
 * 
 * @author giovanebarcelos
 */

public class R033 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantos números deve-se ler? ");
		int numerosParaLer = ler.nextInt();

		long numero, maiorNumero = 0, somaNumeros = 0;
		for (int conta = 1; conta <= numerosParaLer; conta++) {
			System.out.print("Número " + conta + ": ");
			numero = ler.nextInt();

			if (maiorNumero < numero) {
				maiorNumero = numero;
			}

			somaNumeros += numero;
		}

		System.out.printf("Maior número = %d\n", maiorNumero);
		System.out.printf("Média dos números = %.2f\n",
				somaNumeros / (float) (numerosParaLer == 0 ? 1 : numerosParaLer));

		ler.close();
	}
}