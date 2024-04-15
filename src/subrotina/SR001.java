package subrotina;

import java.util.Scanner;

/*
 * Escreva uma sub-rotina que receba como parâmetros um caractere e o número de vezes
 * que este caractere deve ser repetido. Esta sub-rotina deve retornar a variável contendo os
 * caracteres repetidos. Faça um algoritmo principal para testar esta sub-rotina.
 *
 * @author giovanebarcelos
 */

public class SR001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Palavra ou caracter para repetir: ");
		String palavra = ler.next();
		System.out.print("Quantidade vezes para repetir a palavra/caracter: ");
		int vezes = ler.nextInt();

		String novaPalavra = SR001.repetir(palavra, vezes);

		System.out.printf("\nA palavra %s foi repetida %d vezes e resultou em:\n%s", palavra, vezes, novaPalavra);

		ler.close();
	}

	private static String repetir(String palavra, int vezes) {
		String novaPalavra = "";

		while (vezes > 0) {
			novaPalavra += palavra;
			vezes--;
		}

		return novaPalavra;
	}
}