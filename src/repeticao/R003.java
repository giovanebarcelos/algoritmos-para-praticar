package repeticao;

import java.util.Scanner;

/*
 * Você esta fazendo uma pesquisa entre os habitantes de uma pequena vila. Escreva um
 * algoritmo que colete os dados de idade, sexo (M/F) e salário de todos as pessoas que
 * desejam participar da pesquisa (para encerrar a entrada de dados entre a idade menor ou
 * igual a zero). Após coletar todos os dados informe:
 * a. A média de salário do grupo
 * b. Maior e menor idade do grupo
 * c. A percentagem do total de mulheres com salário até R$ 300,00
 * d. A quantidade de homens
 * 
 * @author giovanebarcelos
 */

public class R003 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double mediaSalarios = 0;
		int qtdeEntrevistados = 0, maiorIdade = 0, menorIdade = 0, qtdeMulheresComSalarioAte300 = 0, qtdeMulheres = 0,
				qtdeHomems = 0;

		int idade;
		while (true) {
			System.out.print("Idade: ");
			idade = ler.nextInt();

			if (idade <= 0) {
				break;
			}

			System.out.print("Sexo (M/F): ");
			String sexo = ler.next();
			ler.nextLine();
			System.out.print("Salário: ");
			double salario = ler.nextDouble();

			mediaSalarios += salario;
			qtdeEntrevistados++;

			if (maiorIdade < idade) {
				maiorIdade = idade;
			}

			if (menorIdade == 0 || menorIdade > idade) {
				menorIdade = idade;
			}

			if ("F".equals(sexo)) {
				qtdeMulheres++;

				if (salario <= 300) {
					qtdeMulheresComSalarioAte300++;
				}
			} else {
				qtdeHomems++;
			}
		}

		if (qtdeEntrevistados > 0) {
			mediaSalarios = mediaSalarios / qtdeEntrevistados;

			System.out.println("Informações da Entrevista");
			System.out.printf("a. Média de salário do grupo: %.2f\n", mediaSalarios);
			System.out.printf("b. Maior idade do grupo: %d\n", maiorIdade);
			System.out.printf("c. Menor idade do grupo: %d\n", menorIdade);
			System.out.printf("d. Porcentagem do total de mulheres com salário até R$ 300,00: %.2f%%\n",
					(qtdeMulheresComSalarioAte300 / (float) qtdeMulheres) * 100);
			System.out.printf("e. Quantidade de homens: %d\n", qtdeHomems);
		} else {
			System.out.println("Não houveram entrevistados!");
		}

		ler.close();
	}
}