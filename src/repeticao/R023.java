package repeticao;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e
 * imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a
 * leitura (0 a 10) para cada nota. Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao
 * final. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário
 * deverá encerrar o algoritmo.
 * 
 * @author giovanebarcelos
 */

public class R023 {

	private static final float LIMITEINFERIOR = 0f;
	private static final float LIMITESUPERIOR = 10f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String novoCalculo;
		float nota1, nota2, media;
		do {
			nota1 = lerNota("Nota 1: ", LIMITEINFERIOR, LIMITESUPERIOR);
			nota2 = lerNota("Nota 2: ", LIMITEINFERIOR, LIMITESUPERIOR);

			media = (nota1 + nota2) / 2;

			System.out.printf("Média = %.2f\n", media);

			System.out.print("Novo Cálculo <S/N>? ");
			novoCalculo = ler.nextLine();
		} while ("S".equalsIgnoreCase(novoCalculo));

		ler.close();
	}

	private static float lerNota(String rotulo, float limiteInferior, float limiteSuperior) {
		Scanner ler = new Scanner(System.in);

		float nota = 0f;
		do {
			System.out.print(rotulo);
			nota = ler.nextFloat();

			if (nota < limiteInferior || nota > limiteSuperior) {
				System.out.printf("Nota Inválida! Digite uma nota entre %.2f e %.2f!\n", limiteInferior,
						limiteSuperior);
			}
		} while (nota < limiteInferior || nota > limiteSuperior);

		ler.reset();

		return nota;
	}
}
