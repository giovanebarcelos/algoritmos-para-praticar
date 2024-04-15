package subrotina;

import java.util.Scanner;

/*
 * Escreva uma função capaz de converter um valor monetário de uma moeda para outra,
 * recebendo como parâmetros o valor a converter e a taxa de conversão. Por exemplo:
 * quantia a converter, U$ 10.00 e taxa de conversão R$ = 1.65 US$, então resultado R$
 * 16,50.
 *
 * @author giovanebarcelos
 */

public class SR015 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantia a converter: ");
		double valor = ler.nextDouble();
		System.out.print("Taxa de conversão: ");
		double taxa = ler.nextDouble();

		double valorConvertido = SR015.converter(valor, taxa);

		System.out.printf("O valor %.2f a taxa %.2f é %.2f", valor, taxa, valorConvertido);

		ler.close();
	}

	private static double converter(double valor, double taxa) {
		return valor * taxa;
	}
}