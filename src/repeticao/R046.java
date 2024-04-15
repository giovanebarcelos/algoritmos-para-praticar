package repeticao;

import java.util.Scanner;

/*
 * Uma universidade deseja fazer um levantamento a respeito do seu concurso vestibular.
 * Para cada curso, é fornecido o seguinte conjunto de valores:
 * - o código do curso;
 * - o número de vagas;
 * - número de candidatos do sexo masculino;
 * - número de candidatos do sexo feminino;
 * O último conjunto, para indicar fim de dados, contém o código do curso igual a zero.
 * Fazer um algoritmo que:
 * - calcule escreva, para cada curso, o número de candidatos por vaga e a porcentagem de
 * candidatos do sexo feminino (escreva também o código correspondente do curso);
 * - determine o maior número de candidatos por vaga e escreva esse número juntamente
 * com o código do curso correspondente (supor que não haja empate);
 * - calcule e escreva o total de candidatos;
 * 
 * @author giovanebarcelos
 */

public class R046 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int codigoCurso = 0, codigoCursoMaisConcorrido = 0;
		long totalCandidatosCursoMaisConcorrido = 0;
		float candidatosPorVagaCursoMaisConcorrido = 0f;
		do {
			System.out.print("Código do Curso: ");
			codigoCurso = ler.nextInt();

			if (codigoCurso != 0) {

				System.out.print("Número de Vagas: ");
				int nroDeVagas = ler.nextInt();

				System.out.print("Número de Candidatos Masculino: ");
				int candidatosMasculino = ler.nextInt();

				System.out.print("Número de Candidatos Feminino: ");
				int candidatosFeminino = ler.nextInt();

				long totalDeCandidatos = candidatosFeminino + candidatosMasculino;
				float candidatosPorVaga = totalDeCandidatos / (float) nroDeVagas;

				if (candidatosPorVaga > candidatosPorVagaCursoMaisConcorrido) {
					candidatosPorVagaCursoMaisConcorrido = candidatosPorVaga;
					codigoCursoMaisConcorrido = codigoCurso;
					totalCandidatosCursoMaisConcorrido = totalDeCandidatos;
				}

				System.out.printf("Candidatos por Vagas: %.2f\n", candidatosPorVaga);
				System.out.printf("%d mulheres para o curso %d\n", candidatosFeminino, codigoCurso);
			}
		} while (codigoCurso != 0);

		System.out.printf("\nCurso mais concorrido: %d\n", codigoCursoMaisConcorrido);
		System.out.printf("Candidatos por vaga do curso mais concorrido: %.2f\n", candidatosPorVagaCursoMaisConcorrido);
		System.out.printf("Total de Candidatos: %d\n", totalCandidatosCursoMaisConcorrido);

		ler.close();
	}
}