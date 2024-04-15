package sequencial;

import java.util.Scanner;

/*
 * Escreva um algoritmo para criar um programa de ajuda para vendedores. A partir de um
 * valor total recebido do teclado, mostrar:
 * - o total a pagar com desconto de 10%;
 * - o valor de cada parcela, no parcelamento de 3 x sem juros;
 * - a comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto )
 * - a comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
 * 
 * @author giovanebarcelos
 */

public class S029 {
	private static final float DESCONTODEZPORCENTO = 0.9f;
	private static final float COMISSAOCINCOPORCENTO = 0.05f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Total Venda: ");
		double totalVenda = ler.nextDouble();

		double totalComDesconto = totalVenda * DESCONTODEZPORCENTO;
		double valorParcela3xSemJuros = totalVenda / 3;
		double comissaoVendaAVista = totalComDesconto * COMISSAOCINCOPORCENTO;
		double comissaoVendaParcelada = totalVenda * COMISSAOCINCOPORCENTO;

		System.out.printf("Total a pagar com desconto de 10%% = %.2f\n", totalComDesconto);
		System.out.printf("Valor de cada parcela, no parcelamento de 3x sem juros = %.2f\n", valorParcela3xSemJuros);
		System.out.printf("Comissão no caso da venda ser a vista (5%% sobre o valor com desconto) = %.2f \n",
				comissaoVendaAVista);
		System.out.printf("Comissão no caso da venda ser parcelada (5%% sobre o valor total) = %.2f \n",
				comissaoVendaParcelada);

		ler.close();
	}
}