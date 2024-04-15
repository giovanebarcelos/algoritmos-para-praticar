package repeticao;

import java.util.Scanner;

/*
 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele
 * comercializa. Para isto, mandou digitar uma linha para cada mercadoria com nome, preço
 * de compra e preço de venda das mesmas. Fazer um algoritmo que:determine e escreva
 * quantas mercadorias proporcionam:
 * lucro < 10%
 * 10% ≤ lucro ≤ 20%
 * lucro > 20%
 * determine e escreva o valor total de compra e de venda de todas as mercadorias, assim
 * como o lucro total.
 * A leitura dos dados deve parar quando o preço de venda for zero (0).
 * 
 * @author giovanebarcelos
 */

public class R039 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double custoCompra, precoVenda, lucro, totalCompra = 0, totalVenda = 0;
		int contaLucro10 = 0, contaLucro20 = 0, contaLucroMaiorQue20 = 0, contaTotal = 0;
		do {
			System.out.print("Custo de Compra: ");
			custoCompra = ler.nextDouble();
			System.out.print("Preço de Venda: ");
			precoVenda = ler.nextDouble();

			if (precoVenda > 0) {
				lucro = precoVenda / custoCompra;

				if (lucro < 1.1) {
					contaLucro10++;
				} else if (lucro <= 1.2) {
					contaLucro20++;
				} else {
					contaLucroMaiorQue20++;
				}

				contaTotal++;
				totalCompra += custoCompra;
				totalVenda += precoVenda;
			}
		} while (precoVenda > 0);

		if (contaTotal > 0) {
			System.out.println("Informações do Inventário:");
			System.out.printf("Lucro < 10%% = %.2f%%\n", contaLucro10 / (float) contaTotal * 100);
			System.out.printf("10%% <= Lucro <= 20%% = %.2f%%\n", contaLucro20 / (float) contaTotal * 100);
			System.out.printf("Lucro > 20%% = %.2f%%\n", contaLucroMaiorQue20 / (float) contaTotal * 100);
			System.out.printf("Total de Compra = %.2f\n", totalCompra);
			System.out.printf("Total de Venda = %.2f\n", totalVenda);
		} else {
			System.out.println("Não foram digitados dados!");
		}

		ler.close();
	}
}
