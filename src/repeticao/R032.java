package repeticao;

import java.util.Scanner;

/*
 * O mesmo exercício anterior (R031), mas agora não será informado o número de
 * mercadorias em estoque. Então o funcionamento deverá ser da seguinte forma: ler o valor
 * da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. Ao final, imprimir o valor
 * total em estoque e a média de valor das mercadorias em estoque.
 * 
 * @author giovanebarcelos
 */

public class R032 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valorMercadoria, totalEstoque = 0;
		int totalMercadorias = 0;
		String maisMercadorias;

		do {
			totalMercadorias++;

			System.out.print("Valor total mercadoria " + totalMercadorias + ": ");
			valorMercadoria = ler.nextDouble();

			totalEstoque += valorMercadoria;

			ler.nextLine();

			System.out.print("Mais Mercadorias (S/N)?");
			maisMercadorias = ler.nextLine();
		} while ("S".equalsIgnoreCase(maisMercadorias));

		System.out.printf("Total estoque = %.2f\n", totalEstoque);
		System.out.printf("Média do valor das mercadorias = %.2f\n", totalEstoque / totalMercadorias);

		ler.close();
	}
}