package decisao;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia um dividendo e o seu divisor e, informe se o dividendo é
 * divisível pelo seu divisor.
 * 
 * @author giovanebarcelos
 */

public class C003 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Dividendo: ");
		long dividendo = ler.nextInt();

		System.out.print("Divisor: ");
		long divisor = ler.nextInt();

		if (dividendo % divisor == 0) {
			System.out.printf("%d é divisível por %d\n", dividendo, divisor);
		} else {
			System.out.printf("%d não é divisível por %d\n", dividendo, divisor);
		}

		ler.close();
	}
}
