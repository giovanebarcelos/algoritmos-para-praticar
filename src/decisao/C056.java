package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o
 * preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o
 * desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
 * - Se quantidade <= 5 o desconto será de 2%
 * - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 * - Se quantidade > 10 o desconto será de 5%
 * 
 * @author giovanebarcelos
 */

public class C056 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Descrição do Produto: ");
		String descricaoDoProduto = ler.nextLine();
		System.out.print("Quantidade: ");
		float quantidade = ler.nextFloat();
		System.out.print("Preço Unitário: ");
		double precoUnitario = ler.nextDouble();

		double precoTotal = quantidade * precoUnitario;

		double desconto = 0;
		if (quantidade <= 5) {
			desconto = precoTotal * 0.02;
		} else if (quantidade <= 10) {
			desconto = precoTotal * 0.03;
		} else {
			desconto = precoTotal * 0.05;
		}

		double totalAPagar = precoTotal - desconto;

		System.out.println("Produto = " + descricaoDoProduto);
		System.out.printf("Preco Total = %.2f\n", precoTotal);
		System.out.printf("Desconto = %.2f\n", desconto);
		System.out.printf("Total a Pagar = %.2f\n", totalAPagar);

		ler.close();
	}
}