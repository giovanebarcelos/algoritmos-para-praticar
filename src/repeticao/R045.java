package repeticao;

import java.util.Scanner;

/*
 * Foi feita uma pesquisa de audiência de canal de TV em várias casas de uma certa cidade,
 * num determinado dia. Para cada casa visitada, é fornecido o número do canal (4,5,7,12) e
 * o número de pessoas que o estavam assistindo naquela casa. Se a televisão estivesse
 * desligada, nada era anotado, ou seja, esta casa não entrava na pesquisa. Fazer um
 * algoritmo que:
 * - leia um número indeterminado de dados, sendo que deve parar quando o canal lido for
 * igual a zero;
 * - calcule a porcentagem de audiência para cada emissora;
 * - escreva o número do canal e a sua respectiva porcentagem.
 * 
 * @author giovanebarcelos
 */

public class R045 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int entrevistados = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0, canal = 0;
		do {
			System.out.print("Estas assistindo TV (S/N)? ");
			String assistindo = ler.next();

			if ("S".equalsIgnoreCase(assistindo)) {
				System.out.print("Qual o canal (4,5,7,12 ou 0 para sair)? ");
				canal = ler.nextInt();

				if (canal != 0) {
					entrevistados++;
					switch (canal) {
					case 4:
						canal4++;
						break;
					case 5:
						canal5++;
						break;
					case 7:
						canal7++;
						break;
					case 12:
						canal12++;
						break;
					}
				}
			}
		} while (canal != 0);

		System.out.printf("Canal 4 = %.2f%%\n", canal4 / (float) entrevistados * 100);
		System.out.printf("Canal 5 = %.2f%%\n", canal5 / (float) entrevistados * 100);
		System.out.printf("Canal 7 = %.2f%%\n", canal7 / (float) entrevistados * 100);
		System.out.printf("Canal 12 = %.2f%%\n", canal12 / (float) entrevistados * 100);

		ler.close();
	}
}