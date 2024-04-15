package repeticao;

import java.util.Scanner;

/*
 * Uma empresa decidiu fazer um levantamento em relação aos candidatos que se
 * apresentarem para preenchimento de vagas no seu quadro de funcionários, utilizando
 * processamento eletrônico. Supondo que você seja o programador encarregado desse
 * levantamento, fazer um algoritmo que:
 * - leia um conjunto de dados para cada candidato contendo:
 * a) número de inscrição do candidato;
 * b) idade;
 * c) sexo (masculino, feminino);
 * d) experiência no serviço (sim ou não).
 * O último conjunto contém o número de inscrição do candidato igual a zero.
 * - calcule:
 * a) o número de candidatos do sexo feminino;
 * b) o número de candidatos do sexo masculino;
 * c) idade média dos homens com mais de 45 anos entre o total de homens;
 * d) número de mulheres que têm idade inferior a 35 anos e com experiência no serviço;
 * e) a menor idade entre mulheres que já tem experiência no serviço;
 * - escreva:
 * a) o número de inscrição das mulheres pertencentes ao grupo descrito no item e;
 * b) o que foi calculado em cada item acima especificado.
 * 
 * @author giovanebarcelos
 */

public class R051 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int nroInscricao = 0, idade = 0, contaSexoFeminino = 0, contaSexoMasculino = 0,
				menorIdadeMulheresExperientes = 0, nroInscricaoMenorIdade = 0;
		long somaIdadeHomensComMais45Anos = 0, contaMulheresComMenos35AnosExperientes = 0;
		String sexo, possuiExperiencia;
		do {
			System.out.print("Número de Inscrição: ");
			nroInscricao = ler.nextInt();

			if (nroInscricao > 0) {
				System.out.print("Idade: ");
				idade = ler.nextInt();
				System.out.print("Sexo (M/F)? ");
				sexo = ler.next();
				System.out.print("Possui Experiência (S/N)? ");
				possuiExperiencia = ler.next();

				if ("M".equalsIgnoreCase(sexo)) {
					contaSexoMasculino++;

					if (idade > 45) {
						somaIdadeHomensComMais45Anos += idade;
					}
				} else {
					contaSexoFeminino++;

					if ("S".equalsIgnoreCase(possuiExperiencia)) {
						if (idade < 35) {
							contaMulheresComMenos35AnosExperientes++;
						}

						if (menorIdadeMulheresExperientes == 0 || menorIdadeMulheresExperientes > idade) {
							menorIdadeMulheresExperientes = idade;
							nroInscricaoMenorIdade = nroInscricao;
						}
					}
				}

			}
		} while (nroInscricao > 0);

		System.out.println("Estatísticas: ");
		System.out.printf("Número de candidatos do sexo feminino = %d\n", contaSexoFeminino);
		System.out.printf("Número de candidatos do sexo masculino = %d\n", contaSexoMasculino);
		System.out.printf("Idade média dos homens com mais de 45 anos entre o total de homens = %d\n",
				somaIdadeHomensComMais45Anos / contaSexoMasculino);
		System.out.printf("Número de mulheres que têm idade inferior a 35 anos e com experiência no serviço = %d\n",
				contaMulheresComMenos35AnosExperientes);
		System.out.printf("A mulher com menor idade é %d anos e tem a inscrição de número %d\n",
				menorIdadeMulheresExperientes, nroInscricaoMenorIdade);

		ler.close();
	}

}
