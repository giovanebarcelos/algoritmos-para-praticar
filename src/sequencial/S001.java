package sequencial;

import java.util.Scanner;

/*
 * Criar um algoritmo que leia o valor de um produto e imprima na console este valor com
 * 30% de acréscimo.
 * 
 * @author giovanebarcelos
*/
public class S001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Valor Produto: ");
		float valorProduto = ler.nextFloat();
		float produtoComAcrescimo = (float) (valorProduto * 1.3);

		System.out.printf("O valor do produto %.2f com 30%% de acréscimo é %.2f", valorProduto, produtoComAcrescimo);
		ler.close();
	}
}
