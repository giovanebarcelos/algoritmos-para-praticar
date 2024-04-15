package decisao;

import java.util.Scanner;

/*
 * Entrar com dois números e imprimi-los em ordem decrescente.
 * 
 * @author giovanebarcelos
 */

public class C017 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		long numero1 = ler.nextLong();

		System.out.print("Número 2: ");
		long numero2 = ler.nextLong();

		if (numero1 < numero2) {
			long numeroAux = numero1;
			numero1 = numero2;
			numero2 = numeroAux;
		}

		System.out.printf("Os números em ordem decrescente são: %d e %d", numero1, numero2);

		ler.close();
	}
}