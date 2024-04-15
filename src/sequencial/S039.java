package sequencial;

import java.util.Scanner;

/*
 * Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
 * por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das
 * vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele
 * vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro
 * vendido. Calcule e escreva o salário final do vendedor.
 * 
 * @author giovanebarcelos
 */

public class S039 {
	private static final float PERCENTUALCOMISSAOVENDA = 0.05f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número de Carros: ");
		int numeroCarros = ler.nextInt();

		System.out.print("Valor Total das Vendas: ");
		double totalVendas = ler.nextDouble();

		System.out.print("Salário Fixo: ");
		double salarioFixo = ler.nextDouble();

		System.out.print("Valor da Comissão por Carro Vendido: ");
		double comissaoPorCarroVendido = ler.nextDouble();

		double salarioTotal = salarioFixo + (comissaoPorCarroVendido * numeroCarros)
				+ (totalVendas * PERCENTUALCOMISSAOVENDA);

		System.out.printf("Salário Total = %.2f", salarioTotal);

		ler.close();
	}
}