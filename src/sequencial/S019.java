package sequencial;

import java.util.Scanner;

/*
 * Uma padaria vende certa quantidade de pães franceses e uma quantidade de broas a cada
 * dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer
 * saber quanto arrecadou com a venda dos  pães  e broas  (juntos), e quanto deve guardar
 * numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os
 * cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de
 * pães e de broas, e depois calcular os dados solicitados.
 * 
 * @author giovanebarcelos  
 */

public class S019 {
	private static final double PRECODOSPAES = 0.12;
	private static final double PRECODASBROAS = 1.5;
	private static final double PERCENTUALPOUPANCA = 0.1;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantidade de Pães: ");
		int qtdePaes = ler.nextInt();
		System.out.print("Quantidade de Broas: ");
		int qtdeBroas = ler.nextInt();

		double receitaPaes = qtdePaes * PRECODOSPAES;
		double receitaBroas = qtdeBroas * PRECODASBROAS;
		double receitaTotal = receitaBroas + receitaPaes;
		double poupanca = receitaTotal * PERCENTUALPOUPANCA;

		System.out.printf("Receita dos Pães = %.2f\nReceita das Broas = %.2f\nReceita Total = %.2f\nPoupanca = %.2f",
				receitaPaes, receitaBroas, receitaTotal, poupanca);

		ler.close();
	}
}
