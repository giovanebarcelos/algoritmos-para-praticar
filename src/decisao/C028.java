package decisao;

import java.util.Scanner;

/*
 * Um plano de saúde, após as negociações com o governo enviou a tabela abaixo para seus
 * associados. Faça um algoritmo que leia o nome e a idade do associado e imprima o nome
 * o valor que esta pessoa deverá pagar.
 * - até 10 anos = R$ 30,00
 * - maior de 10 até 29 anos = R$ 60,00
 * - maior de 29 até 45 anos = R$ 120,00
 * - maior de 45 até 59 anos = R$ 150,00
 * - maior de 59 até 65 anos = R$ 250,00
 * - maior 65 anos = R$ 400,00
 * 
 * @author giovanebarcelos
 */

public class C028 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = ler.nextLine();

		System.out.print("Idade: ");
		int idade = ler.nextInt();

		double valor;
		if (idade <= 10) {
			valor = 30f;
		} else if (idade <= 29) {
			valor = 60f;
		} else if (idade <= 45) {
			valor = 120f;
		} else if (idade <= 59) {
			valor = 150f;
		} else if (idade <= 65) {
			valor = 250f;
		} else {
			valor = 400f;
		}

		System.out.printf("%s deve pagar %.2f", nome, valor);

		ler.close();
	}
}
