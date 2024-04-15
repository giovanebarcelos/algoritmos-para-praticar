package decisao;

import java.util.Scanner;

/*
 * Um comerciante comprou um produto e quer vendê-lo com um lucro de 50% se o valor da
 * compra for menor que R$ 25,00 e caso contrário, o lucro será de 35%. Entrar com custo
 * do produto e mostrar o valor de venda.
 * 
 * @author giovanebarcelos
 */

public class C025 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Custo do Produto: ");
		double custoProduto = ler.nextDouble();

		double valorVenda;
		if (custoProduto < 25) {
			valorVenda = custoProduto * 1.5;
		} else {
			valorVenda = custoProduto * 1.35;
		}

		System.out.printf("O preço de venda é %.2f", valorVenda);

		ler.close();
	}
}