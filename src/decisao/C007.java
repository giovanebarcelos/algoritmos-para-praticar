package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia dois números quaisquer e informe se o primeiro é menor, é
 * igual ou maior que o segundo número digitado.
 * 
 * @author giovanebarcelos
 */

public class C007 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		int numero1 = ler.nextInt();

		System.out.print("Número 2: ");
		int numero2 = ler.nextInt();

		if (numero1 < numero2) {
			System.out.printf("O número %d é menor que %d!", numero1, numero2);
		} else if (numero1 == numero2) {
			System.out.printf("O número %d é igual %d!", numero1, numero2);
		} else {
			System.out.printf("O número %d é maior que %d!", numero1, numero2);
		}

		ler.close();
	}
}