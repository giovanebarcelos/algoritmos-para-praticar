package decisao;

import java.util.Scanner;

/*
 * Entrar com três números e imprimir o maior número.
 * 
 * @author giovanebarcelos
 */

public class C018 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		long numero1 = ler.nextLong();

		System.out.print("Número 2: ");
		long numero2 = ler.nextLong();

		System.out.print("Número 3: ");
		long numero3 = ler.nextLong();

		long maiorNumero = numero1;

		if (maiorNumero < numero2) {
			maiorNumero = numero2;
		}

		if (maiorNumero < numero3) {
			maiorNumero = numero3;
		}

		System.out.printf("O maior número é %d!", maiorNumero);

		ler.close();
	}
}