package repeticao;

import java.util.Scanner;

/*
 * Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um
 * algoritmo que permita a entrada das seguintes informações: a) o número total de
 * mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o valor total em
 * estoque e a média de valor das mercadorias.
 * 
 * @author giovanebarceos
 */

public class R031 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Total de Mercadorias no Estoque: ");
		int totalMercadorias = ler.nextInt();

		double valorMercadoria, totalEstoque = 0;
		for (int mercadoria = 1; mercadoria <= totalMercadorias; mercadoria++) {
			System.out.print("Valor total mercadoria " + mercadoria + ": ");
			valorMercadoria = ler.nextDouble();

			totalEstoque += valorMercadoria;
		}

		System.out.printf("Total estoque = %.2f\n", totalEstoque);
		System.out.printf("Média do valor das mercadorias = %.2f\n", totalEstoque / totalMercadorias);

		ler.close();
	}
}