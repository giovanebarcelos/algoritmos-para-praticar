package sequencial;

import java.util.Scanner;

/*
 * Fazer um algoritmo para ler dois números e mostrar o maior deles.
 * 
 * @author giovanebarcelos
 */

public class S024 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Numero 1: ");
		int numero1 = ler.nextInt();
		System.out.print("Numero 2: ");
		int numero2 = ler.nextInt();

		int maiorNumero = ((numero1 + numero2) + Math.abs(numero1 - numero2)) / 2;

		System.out.printf("O maior número entre %d e %d é %d", numero1, numero2, maiorNumero);

		ler.close();
	}
}