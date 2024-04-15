package repeticao;

import java.util.Scanner;

/*
 * Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não
 * de um novo produto lançado no mercado. Para isso, forneceu o sexo do entrevistado e sua
 * resposta (sim ou não). Sabendo-se que foram entrevistadas N pessoas, fazer um algoritmo
 * que calcule e escreva:
 * - o número de pessoas que responderam sim;
 * - o número de pessoas que responderam não;
 * - a porcentagem de pessoas do sexo feminino que responderam sim;
 * - a porcentagem de pessoas do sexo masculino que responderam não.
 * Observação: Este algoritmo deve ler o valor N antes de começar a ler os dados da pesquisa.
 * 
 * @author giovanebarcelos
 */

public class R043 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantos serão pesquisados? ");
		int pesquisados = ler.nextInt();

		// Evitar salto
		ler.nextLine();

		int qtdeSexoFemininoQueGostaram = 0, qtdeSexoMasculinoQueNaoGostaram = 0, sim = 0, nao = 0;
		for (int pesquisado = 1; pesquisado <= pesquisados; pesquisado++) {
			System.out.print("Sexo (M/F): ");
			String sexo = ler.nextLine();

			System.out.print("Gostou do Produto (S/N)?");
			String gostou = ler.nextLine();

			if ("S".equalsIgnoreCase(gostou)) {
				sim++;

				if ("F".equalsIgnoreCase(sexo)) {
					qtdeSexoFemininoQueGostaram++;
				}
			} else {
				nao++;

				if ("M".equalsIgnoreCase(sexo)) {
					qtdeSexoMasculinoQueNaoGostaram++;
				}
			}
		}

		System.out.printf("%d gostaram do produto!\n", sim);
		System.out.printf("%d não gostaram do produto!\n", nao);
		System.out.printf("%.2f%% do sexo feminino responderam sim!\n",
				qtdeSexoMasculinoQueNaoGostaram / (float) (pesquisados == 0 ? 1 : pesquisados) * 100);
		System.out.printf("%.2f%% do sexo masculino responderam não!\n",
				qtdeSexoFemininoQueGostaram / (float) (pesquisados == 0 ? 1 : pesquisados) * 100);

		ler.close();
	}
}