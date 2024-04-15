package repeticao;

import java.util.Scanner;

/*
 * O sistema de avaliação de uma determinada disciplina obedece aos seguintes critérios:
 * - durante o semestre são dadas três notas;
 * - a nota final é obtida pela média aritmética das notas dadas durante o curso;
 * - é considerado aprovado o aluno que obtiver a nota final superior ou igual a 60 e que tiver
 * comparecido a um mínimo de 40 aulas.
 * Fazer um algoritmo que:
 * a) Leia um conjunto de dados contendo o número de matrícula, as três notas e a frequência
 * (número de aulas frequentadas) de 100 alunos.
 * b) Calcule:
 * - a nota final de cada aluno;
 * - a maior e menor nota da turma;
 * - a nota média da turma;
 * - o total de alunos reprovados;
 * 
 * @author giovanebarcelos
 */

public class R047 {

	private static final float MIL = 1000;
	private static final int NUMERODEALUNOS = 100;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float nota1, nota2, nota3, notaFinal, maiorNota = 0, menorNota = MIL, totalDasNotasFinais = 0;
		int frequencia, contaReprovados = 0;
		for (int aluno = 1; aluno <= NUMERODEALUNOS; aluno++) {
			System.out.println("Aluno " + aluno);
			System.out.print("Nota 1: ");
			nota1 = ler.nextFloat();
			System.out.print("Nota 2: ");
			nota2 = ler.nextFloat();
			System.out.print("Nota 3: ");
			nota3 = ler.nextFloat();
			System.out.print("Frequencia: ");
			frequencia = ler.nextInt();

			notaFinal = (nota1 + nota2 + nota3) / 3;
			totalDasNotasFinais += notaFinal;

			System.out.printf("Nota Final: %.2f\n", notaFinal);

			if (maiorNota < notaFinal) {
				maiorNota = notaFinal;
			}

			if (menorNota > notaFinal) {
				menorNota = notaFinal;
			}

			if (notaFinal < 60 || frequencia < 40) {
				System.out.println("Reprovado!");
				contaReprovados++;
			} else {
				System.out.println("Aprovado!");
			}
		}

		System.out.println("Estatísticas: ");
		System.out.printf("Menor Nota = %.2f\n", menorNota);
		System.out.printf("Maior Nota = %.2f\n", maiorNota);
		System.out.printf("Nota Média da Turma = %.2f\n", totalDasNotasFinais / NUMERODEALUNOS);
		System.out.printf("Alunos Reprovados = %d\n", contaReprovados);

		ler.close();
	}
}