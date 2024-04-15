package repeticao;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler o código e o preço de 10 produtos, calcular e escrever:
 * - o maior preço lido
 * - a média aritmética dos preços dos produtos
 * 
 * @author giovanebarcelos
 *  */

public class R034 {
	private static final int QTDEPRODUTOS = 2;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double precoDoProduto, maiorPreco = 0, precoTotal = 0;
		for (int produto = 1; produto <= QTDEPRODUTOS; produto++) {
			System.out.print("Preço: ");
			precoDoProduto = ler.nextDouble();

			ler.nextLine();

			if (maiorPreco < precoDoProduto) {
				maiorPreco = precoDoProduto;
			}

			precoTotal += precoDoProduto;
		}

		System.out.printf("Maior preço lido = %.2f\n", maiorPreco);
		System.out.printf("Média aritmética dos preços = %.2f\n", precoTotal / QTDEPRODUTOS);

		ler.close();
	}
}