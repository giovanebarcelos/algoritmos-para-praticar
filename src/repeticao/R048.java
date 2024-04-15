package repeticao;

import java.util.Scanner;

/*
 * Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica em uma
 * determinada cidade. Para isso, são fornecidos os seguintes dados:
 * - preço do kWh consumido;
 * - número do consumidor;
 * - quantidade de kWh consumidos durante o mês;
 * - código do tipo de consumidor (residencial, comercial, industrial).
 * O número do consumidor igual a zero deve ser usado como sinalizador de fim da leitura
 * de dados da pesquisa. Fazer um algoritmo que:
 * - leia os dados descritos acima:
 * - calcule:
 * a) para cada consumidor, o total a pagar;
 * b) o maior consumo verificado;
 * c) o menor consumo verificado;
 * d) o total do consumo para cada um dos três tipos de consumidores;
 * e) a média geral de consumo;
 * - escreva:
 * a) para cada consumidor, o seu número e o total a pagar;
 * b) o que foi calculado nos itens b, c, d, e acima especificados.
 *
 * @author giovanebarcelos 
 */

public class R048 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numeroConsumidor = 0, contaConsumidores = 0;
		double precoKwhConsumido = 0f, qtdeKwhConsumido = 0f, maiorConsumo = 0, menorConsumo = -1, totalConsumo = 0;
		do {
			System.out.print("Número do Consumidor: ");
			numeroConsumidor = ler.nextInt();

			if (numeroConsumidor != 0) {
				System.out.print("Preço Kwh Consumido: ");
				precoKwhConsumido = ler.nextDouble();
				System.out.print("Qtde Kwh Consumido: ");
				qtdeKwhConsumido = ler.nextDouble();
				System.out.print("Código tipo Consumidor -> (R)esidencial, (C)omercial ou (I)ndustrial: ");
				String codigoTipoConsumidor = ler.next();

				System.out.printf("Consumidor %d do tipo %s deve Total a Pagar = %.2f\n\n", numeroConsumidor,
						codigoTipoConsumidor, qtdeKwhConsumido * precoKwhConsumido);

				if (menorConsumo == -1 || menorConsumo > qtdeKwhConsumido) {
					menorConsumo = qtdeKwhConsumido;
				}

				if (maiorConsumo < qtdeKwhConsumido) {
					maiorConsumo = qtdeKwhConsumido;
				}

				contaConsumidores++;
				totalConsumo += qtdeKwhConsumido;
			}
		} while (numeroConsumidor != 0);

		System.out.println("Estatísticas: ");
		System.out.printf("Menor Consumo Verificado: %.2f\n", menorConsumo);
		System.out.printf("Maior Consumo Verificado: %.2f\n", maiorConsumo);
		System.out.printf("Total Geral de Consumo: %.2f\n", totalConsumo);
		System.out.printf("Média dos Consumos: %.2f\n", totalConsumo / contaConsumidores);

		ler.close();
	}
}
