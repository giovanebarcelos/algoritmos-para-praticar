package sequencial;

import java.util.Scanner;

/*
 * Faça um algoritmo leia as variáveis x, y e z. Mostre o resultado da expressão: (( x – 5) *
 * y) – z
 * 
 * @author giovanebarcelos
 */

public class S027 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Variável X: ");
		long x = ler.nextLong();
		System.out.print("Variável Y: ");
		long y = ler.nextLong();
		System.out.print("Variável Z: ");
		long z = ler.nextLong();

		long resultado = ((x - 5) * y) - z;

		System.out.printf("O resultado de ((x - 5) * y) - z é %d", resultado);

		ler.close();
	}
}
