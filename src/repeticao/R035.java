package repeticao;

import java.util.Scanner;

/*
 * A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um
 * algoritmo para coletar dados sobre o salário e número de filhos de cada habitante e após
 * as leituras, escrever:
 * a) Média de salário da população
 * b) Média do número de filhos
 * c) Maior salário dos habitantes
 * d) Percentual de pessoas com salário menor que R$ 150,00
 * O final da leituras dos dados se dará com a entrada de um “salário negativo”.
 * 
 * @author giovanebarcelos
 */

public class R035 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double salario, somaSalarios = 0, maiorSalario = 0;
		long nroFilhos, somaNroFilhos = 0, contaSalariosMenor150 = 0, qtdePesquisados = 0;
		while (true) {
			System.out.print("Salário: ");
			salario = ler.nextDouble();

			if (salario < 0) {
				break;
			}

			qtdePesquisados++;

			System.out.print("Número de Filhos: ");
			nroFilhos = ler.nextInt();

			if (maiorSalario < salario) {
				maiorSalario = salario;
			}

			if (salario < 150) {
				contaSalariosMenor150++;
			}

			somaSalarios += salario;
			somaNroFilhos += nroFilhos;
		}

		System.out.println("Estatísticas da Pesquisa: ");
		System.out.printf("Média de salário da população = %.2f\n", somaSalarios / qtdePesquisados);
		System.out.printf("Média do número de filhos = %d\n", somaNroFilhos / qtdePesquisados);
		System.out.printf("Maior salário dos habitantes = %.2f\n", maiorSalario);
		System.out.printf("Percentual de pessoas com salário menor que R$ 150,00 = %.2f\n",
				contaSalariosMenor150 / (float) somaNroFilhos);

		ler.close();
	}
}