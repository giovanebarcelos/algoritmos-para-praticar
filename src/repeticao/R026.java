package repeticao;

import java.util.Scanner;

/*
 * Ler um valor N e imprimir todos os valores inteiros entre 1 e N.
 * 
 * @author giovanebarcelos
 */

public class R026 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número: ");
		long numero = ler.nextLong();

		for (int conta = 1; conta <= numero; conta++) {
			System.out.println(conta);
		}

		ler.close();
	}
}