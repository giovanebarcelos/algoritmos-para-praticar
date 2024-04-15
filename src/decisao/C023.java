package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia dois nomes e imprima estes nomes em ordem alfabética.
 * 
 * @author giovanebarcelos
 */

public class C023 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Nome 1: ");
		String nome1 = ler.nextLine();

		System.out.print("Nome 2: ");
		String nome2 = ler.nextLine();

		if (nome1.compareToIgnoreCase(nome2) > 0) {
			String nomeAuxiliar = nome1;
			nome1 = nome2;
			nome2 = nomeAuxiliar;
		}

		System.out.printf("Nomes em ordem: \n* %s\n* %s\n", nome1, nome2);

		ler.close();
	}
}
