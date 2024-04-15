package decisao;

import java.util.Scanner;

/*
 * Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever
 * o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
 * 
 * @author giovanebarcelos
 */

public class C050 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Nome Time 1: ");
		String nomeTime1 = ler.nextLine();

		System.out.print("Números Gols do Time 1: ");
		int numeroGolsTime1 = ler.nextInt();

		ler.nextLine();

		System.out.print("Nome Time 2: ");
		String nomeTime2 = ler.nextLine();

		System.out.print("Números Gols do Time 2: ");
		int numeroGolsTime2 = ler.nextInt();

		if (numeroGolsTime1 == numeroGolsTime2) {
			System.out.println("Empate!");
		} else if (numeroGolsTime1 > numeroGolsTime2) {
			System.out.printf("Vencedor: %s", nomeTime1);
		} else {
			System.out.printf("Vencedor: %s", nomeTime2);
		}

		ler.close();
	}
}