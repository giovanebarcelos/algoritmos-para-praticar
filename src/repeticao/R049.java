package repeticao;

import java.util.Scanner;

/*
 * Tem-se uma estrada ligando várias cidades. Cada cidade tem seu marco quilométrico. 
 * Fazer um algoritmo que:
 * - leia vários pares de dados, contendo cada par os valores dos marcos quilométricos, em
 * ordem crescente, de duas cidades. O último par contém estes dois valores iguais;
 * - calcule os tempos decorridos para percorrer a distância entre estas duas cidades, com as
 * seguintes velocidades: 20, 30, 40, 50, 60, 70, 80 km/hora, sabendo-se que
 * t = e / v , onde t = tempo; e = espaço; v = velocidade;
 * - escreva os marcos quilométricos, a velocidade e o tempo decorrido entre as duas
 * cidades, apenas quando este tempo for superior a 2 horas.
 * 
 * @author giovanebarcelos
 */

public class R049 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float kmCidade1 = 0, kmCidade2 = 0;
		do {
			System.out.print("KM da Cidade 1: ");
			kmCidade1 = ler.nextFloat();
			System.out.print("KM da Cidade 2: ");
			kmCidade2 = ler.nextFloat();

			if (kmCidade1 != kmCidade2) {
				float espacoEmKM = kmCidade2 - kmCidade1;

				if (espacoEmKM >= 2.0) {
					int velocidade = 20;

					while (velocidade <= 80) {

						float tempo = espacoEmKM / velocidade;

						System.out.printf("A %d km/hora vai levar %.2f horas para percorrer %.2f km\n", velocidade,
								tempo, espacoEmKM);
						velocidade += 10;
					}
				}
			}
		} while (kmCidade1 != kmCidade2);

		ler.close();
	}
}