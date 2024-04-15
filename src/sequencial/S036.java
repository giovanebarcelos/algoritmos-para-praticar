package sequencial;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler o número total de eleitores de um município, o número de
 * votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa
 * em relação ao total de eleitores.
 * 
 * @author giovanebarcelos
 */

public class S036 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Total de eleitores: ");
		long totalEleitores = ler.nextLong();
		System.out.print("Número de votos em branco: ");
		long votosEmBranco = ler.nextLong();
		System.out.print("Número de votos nulos: ");
		long votosNulos = ler.nextLong();
		System.out.print("Número de votos válidos: ");
		long votosValidos = ler.nextLong();

		float percentualEmBranco = (float) (votosEmBranco / (float) totalEleitores * 100.0);
		float percentualNulo = (float) (votosNulos / (float) totalEleitores * 100.0);
		float percentualValido = (float) (votosValidos / (float) totalEleitores * 100.0);

		System.out.printf("Votos em Branco = %.2f%%\n", percentualEmBranco);
		System.out.printf("Votos Nulos = %.2f%%\n", percentualNulo);
		System.out.printf("Votos Válidos = %.2f%%\n", percentualValido);

		ler.close();
	}
}
