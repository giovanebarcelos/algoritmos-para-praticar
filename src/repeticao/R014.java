package repeticao;

import java.util.Scanner;

/*
 * Elabore um algoritmo para ler a altura e o sexo (masculino ou feminino) de 10 (dez)
 * pessoas. Calcular e mostrar:
 * - a maior e a menor altura do grupo
 * - a média de altura das mulheres
 * - o número de homens (quantos homens)
 * - a porcentagem de mulheres (em relação ao no total de pessoas)
 */

public class R014 {

	private static final int QTDEPESSOAS = 10;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float maiorAltura = 0, menorAltura = 0, mediaAlturaMulheres = 0;
		int qtdeHomens = 0, qtdeMulheres = 0;

		for (int pessoa = 1; pessoa <= QTDEPESSOAS; pessoa++) {
			System.out.println("-> Pessoa " + pessoa);

			System.out.print("Altura (m): ");
			float altura = ler.nextFloat();

			System.out.print("Sexo (M/F): ");
			String sexo = ler.next();

			if (maiorAltura < altura) {
				maiorAltura = altura;
			}

			if (menorAltura == 0 || menorAltura > altura) {
				menorAltura = altura;
			}

			if ("F".equalsIgnoreCase(sexo)) {
				mediaAlturaMulheres += altura;
				qtdeMulheres++;
			} else {
				qtdeHomens++;
			}
		}

		System.out.println("Dados Estatísticos: ");
		System.out.printf("* Maior altura: %.2f\n", maiorAltura);
		System.out.printf("* Menor altura: %.2f\n", menorAltura);
		System.out.printf("* Média atual das mulheres: %.2f\n",
				mediaAlturaMulheres / (qtdeMulheres > 0 ? qtdeMulheres : 1));
		System.out.printf("* Quantidade de homens: %d\n", qtdeHomens);
		System.out.printf("* Porcentagem de mulheres: %.2f%%\n", qtdeMulheres / (float) QTDEPESSOAS * 100);

		ler.close();
	}
}
