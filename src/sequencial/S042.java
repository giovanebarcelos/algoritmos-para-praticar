package sequencial;

import java.util.Scanner;

/*
 * Calcular a quantidade dinheiro gasta por um fumante. Dados: o número de anos que ele
 * fuma, o no de cigarros fumados por dia e o preço de uma carteira.
 * 
 * @author giovanebarcelos
 */

public class S042 {
	private static final int DIASPORANO = 365;
	private static final double CIGARROSPORCARTEIRA = 20;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número de anos fumando: ");
		int anosFumando = ler.nextInt();

		System.out.print("Número de cigarros por dia: ");
		int cigarrosPorDia = ler.nextInt();

		System.out.print("Preço por carteira: ");
		double precoPorCarteira = ler.nextDouble();

		double totalGasto = anosFumando * DIASPORANO * cigarrosPorDia * precoPorCarteira / CIGARROSPORCARTEIRA;

		System.out.printf("Gasto Total = %.2f", totalGasto);

		ler.close();
	}
}