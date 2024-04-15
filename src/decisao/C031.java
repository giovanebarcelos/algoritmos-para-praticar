package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia o código do produto e a quantidade e, mostre na tela o nome e
 * o valor do produto conforme tabela apresentada abaixo:
 * 
 * Código  Nome     Valor
 * P001    Caneta    1,25
 * P002    Lápis     0,85
 * P003    Borracha  1,75
 * 
 * @author giovanebarcelos
 */
public class C031 {
	public static void main(String[] args) {
		System.out.println("Produtos Disponíveis");
		System.out.println("Código  Nome     Valor");
		System.out.println("P001    Caneta    1,25");
		System.out.println("P002    Lápis     0,85");
		System.out.println("P003    Borracha  1,75");

		Scanner ler = new Scanner(System.in);

		System.out.print("Código do Produto: ");
		String codigoProduto = ler.nextLine();

		System.out.print("Quantidade: ");
		long quantidade = ler.nextInt();

		String nome;
		double valor;

		if ("P001".equals(codigoProduto)) {
			nome = "Caneta";
			valor = 1.25f;
		} else if ("P002".equals(codigoProduto)) {
			nome = "Lápis";
			valor = 0.85f;
		} else if ("P003".equals(codigoProduto)) {
			nome = "Borracha";
			valor = 1.75f;
		} else {
			nome = "Produto não Cadastrado";
			valor = 0f;
		}

		System.out.printf("%s = %d * %.2f = %.2f", nome, quantidade, valor, quantidade * valor);

		ler.close();
	}
}