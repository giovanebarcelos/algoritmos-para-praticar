package decisao;

import java.util.Scanner;

/*
 * Entrar com três números e imprimir o maior número.
 * 
 * @author giovanebarcelos
 */

public class C019 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		long numero1 = ler.nextLong();

		System.out.print("Número 2: ");
		long numero2 = ler.nextLong();

		System.out.print("Número 3: ");
		long numero3 = ler.nextLong();

		long numeroAux;
		if (numero1 < numero2) {
			numeroAux = numero1;
			numero1 = numero2;
			numero2 = numeroAux;
		}

		if (numero2 < numero3) {
			numeroAux = numero2;
			numero2 = numero3;
			numero3 = numeroAux;
		}

		if (numero1 < numero2) {
			numeroAux = numero1;
			numero1 = numero2;
			numero2 = numeroAux;
		}

		System.out.printf("Os números em ordem decrescente são: %d, %d e %d", numero1, numero2, numero3);

		ler.close();
	}
}