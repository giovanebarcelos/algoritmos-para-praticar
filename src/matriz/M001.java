package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo que informe a quantidade total de calorias da refeição a partir da
 * escolha do usuário que deverá informar o prato, a sobremesa e bebida, conforme tabela
 * abaixo: 
 * PRATO               SOBREMESA               BEBIDA
 * Vegetariano 180cal  Abacaxi          75cal  Chá               20cal
 * Peixe       230cal  Sorvete diet    110cal  Suco de Laranja   70cal
 * Frango      250cal  Mousse diet     170cal  Suco melão       100cal
 * Carne       350cal  Mouse chocolate 200cal  Refrigerante diet 65cal
 *  
 *  @author giovanebarcelos
 */

public class M001 {
	private static final int POSICAODOPRATO = 0;
	private static final int POSICAODASOBREMESA = 1;
	private static final int POSICAODABEBIDA = 2;

	public static void main(String[] args) {
		String[][] refeicao = { { "Vegetariano", "Peixe", "Frango", "Carne" },
				{ "Abacaxi", "Sorvete diet", "Mousse diet", "Mouse chocolate" },
				{ "Chá", "Suco de Laranja", "Suco melão", "Refrigerante diet" } };
		int[][] calorias = { { 180, 230, 250, 350 }, { 75, 110, 170, 200 }, { 20, 70, 100, 65 } };

		int prato = escolha("Escolha o Prato: ", POSICAODOPRATO, refeicao);
		int sobremesa = escolha("Escolha a Sobremesa: ", POSICAODASOBREMESA, refeicao);
		int bebida = escolha("Escolha a Bebida: ", POSICAODABEBIDA, refeicao);

		int caloriasDaRefeicao = calorias[POSICAODOPRATO][prato] + calorias[POSICAODASOBREMESA][sobremesa]
				+ calorias[POSICAODABEBIDA][bebida];

		System.out.printf("Quantidade total de calorias da refeição = %d", caloriasDaRefeicao);
	}

	private static int escolha(String mensagem, int posicao, String[][] refeicao) {
		Scanner ler = new Scanner(System.in);

		System.out.println(mensagem);

		for (int opcao = 0; opcao < refeicao[posicao].length; opcao++) {
			System.out.printf("%d) %s\n", opcao + 1, refeicao[posicao][opcao]);
		}

		System.out.print("Opção: ");
		int opcao = ler.nextInt();

		ler.reset();

		return opcao - 1;
	}
}