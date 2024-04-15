package sequencial;

import java.util.Scanner;

/*
 * Fazer um algoritmo que leia três notas e mostre:
 * - a média das notas
 * - a situação final do aluno
 * onde :
 * - aprovado - media >= 7
 * - prova final - media > = 4 e media < 7
 * - reprovado - media < 4
 * 
 * @author giovanebarcelos
 */

public class S031 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Nota 1: ");
		float nota1 = ler.nextFloat();
		System.out.print("Nota 2: ");
		float nota2 = ler.nextFloat();
		System.out.print("Nota 3: ");
		float nota3 = ler.nextFloat();

		float mediaNotas = (nota1 + nota2 + nota3) / 3;

		System.out.printf("A média das notas é %.2f\n", mediaNotas);

		if (mediaNotas < 4) {
			System.out.println("Situação: Reprovado!");
		} else if (mediaNotas < 7) {
			System.out.println("Situação: Prova Final!");
		} else {
			System.out.println("Situação: Aprovado!");
		}

		ler.close();
	}
}
