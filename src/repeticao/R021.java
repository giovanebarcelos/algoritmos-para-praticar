package repeticao;

import java.util.Scanner;

/*
 * Escreva um programa para ler o número de matrícula e a altura de N alunos. O programa
 * deve encontrar e mostrar na tela a matrícula do aluno mais alto e a matrícula do aluno
 * mais baixo. A leitura deve finalizar quando a altura do aluno for igual a 0.
 * 
 * @author giovanebarcelos
 */

public class R021 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String matricula, matriculaMaisAlto = "", matriculaMaisBaixo = "";
		float altura, alturaMaisAlto = 0, alturaMaisBaixo = 0;
		while (true) {
			System.out.print("Matrícula: ");
			matricula = ler.nextLine();
			System.out.print("Altura: ");
			altura = ler.nextFloat();

			// Evitar salto de linha
			ler.nextLine();

			if (altura == 0) {
				break;
			}

			if (alturaMaisAlto < altura) {
				alturaMaisAlto = altura;
				matriculaMaisAlto = matricula;
			}

			if (alturaMaisBaixo == 0 || alturaMaisBaixo > altura) {
				alturaMaisBaixo = altura;
				matriculaMaisBaixo = matricula;
			}
		}

		System.out.printf("Código matrícula %s tem altura mais alta (%.2f)\n", matriculaMaisAlto, alturaMaisAlto);
		System.out.printf("Código matrícula %s tem altura mais baixa (%.2f)\n", matriculaMaisBaixo, alturaMaisBaixo);

		ler.close();
	}
}