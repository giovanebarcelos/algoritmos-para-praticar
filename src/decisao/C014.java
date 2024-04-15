package decisao;

import java.util.Scanner;

/*
 * Entrar com dois números e imprimir o maior número.
 * 
 * @author giovanebarcelos
 */

public class C014 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		long numero1 = ler.nextLong();

		System.out.print("Número 2: ");
		long numero2 = ler.nextLong();

		if (numero1 > numero2) {
			System.out.println("O número " + numero1 + " é o maior!");
		} else {
			System.out.println("O número " + numero2 + " é o maior!");
		}

		ler.close();
	}
}