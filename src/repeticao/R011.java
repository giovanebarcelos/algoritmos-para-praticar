package repeticao;

import java.util.Scanner;

/*
 * Escreva um programa que leia um valor inteiro n, calcule e mostre a soma dos n primeiros
 * números pares. Exemplo: n = 3, apresentará 2 + 4 + 6 = 12.
 * 
 * @author giovanebarcelos
 */

public class R011 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número: ");
		long numero = ler.nextLong();

		long soma = 0, numeroPar;
		for (long numeroSoma = 1; numeroSoma <= numero; numeroSoma++) {
			numeroPar = numeroSoma * 2;
			soma += numeroPar;

			System.out.printf("%d%s", numeroPar, numeroSoma == numero ? "" : " + ");
		}

		System.out.printf(" = %d", soma);

		ler.close();
	}
}