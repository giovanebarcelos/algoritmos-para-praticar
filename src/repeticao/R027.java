package repeticao;

import java.util.Scanner;

/*
 * Modifique o exercício anterior (R026) para aceitar somente valores maiores que 0 para N.
 * Caso o valor informado (para N) não seja maior que 0, deverá ser lido um novo valor para * N.
 * 
 * @author giovanebarcelos
 */

public class R027 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		long numero;
		do {
			System.out.print("Número: ");
			numero = ler.nextLong();

			if (numero <= 0) {
				System.out.println("Número Inválido! Deve ser superior a zero.");
			}
		} while (numero <= 0);

		for (int conta = 1; conta <= numero; conta++) {
			System.out.println(conta);
		}

		ler.close();

	}
}