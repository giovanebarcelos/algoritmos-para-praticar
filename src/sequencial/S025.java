package sequencial;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia o nome e as idades de duas pessoas e mostre a soma das idades.
 * 
 * @author giovanebarcelos
 */

public class S025 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Nome 1: ");
		String nome1 = ler.nextLine();
		System.out.print("Idade 1: ");
		int idade1 = ler.nextInt();

		// Solução alternativa para não saltar leitura do campo2
		ler.nextLine();

		System.out.print("Nome 2: ");
		String nome2 = ler.nextLine();
		System.out.print("Idade 2: ");
		int idade2 = ler.nextInt();

		int somaIdades = idade1 + idade2;

		System.out.printf("A soma das idades de %s e %s é %d", nome1, nome2, somaIdades);

		ler.close();
	}
}
