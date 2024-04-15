package sequencial;

import java.util.Scanner;

/*
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
 * do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
 * do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo
 * de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 * 
 * @author giovanebarcelos
 */

public class S038 {
	private static final double PERCENTUALDEIMPOSTOS = 1.45;
	private static final double PERCENTUALDODISTRIBUIDOR = 1.28;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Custo de Fábrica do Carro: ");
		double custoCarro = ler.nextDouble();

		double custoFinalDoCarro = custoCarro * PERCENTUALDODISTRIBUIDOR * PERCENTUALDEIMPOSTOS;

		System.out.printf("O custo final do carro é %.2f", custoFinalDoCarro);

		ler.close();
	}
}