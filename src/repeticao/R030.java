package repeticao;

import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos
 * 10 números lidos.
 * 
 * @author giovanebarcelos
 */

public class R030 {
	private static final int NUMEROSPARALER = 10;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		long numeros = NUMEROSPARALER, numero, somaDosNumeros = 0;

		while (numeros > 0) {
			System.out.print("Número: ");
			numero = ler.nextInt();

			somaDosNumeros += numero;

			numeros--;
		}

		System.out.printf("Soma dos números é %d", somaDosNumeros);

		ler.close();
	}
}