package matriz;

import java.util.Scanner;

/*
 * Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes
 * lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer
 * de pessoa e depois escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes
 * lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário.
 *
 * @author giovanebarcelos
 */

public class M010 {
	private static final int QTDENOMES = 10;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String[] nomes = new String[M010.QTDENOMES];

		M010.ler(nomes);

		System.out.print("\nNome para pesquisar: ");
		String nome = ler.nextLine();

		if (M010.existeNome(nome, nomes)) {
			System.out.println("ACHEI!");
		} else {
			System.out.println("NÃO ACHEI!");
		}

		ler.close();
	}

	private static boolean existeNome(String nome, String[] nomes) {
		boolean achei = false;

		for (int posicao = 0; !achei && (posicao < nomes.length); posicao++) {
			achei = nome.equalsIgnoreCase(nomes[posicao]);
		}

		return achei;
	}

	private static void ler(String[] nomes) {
		Scanner ler = new Scanner(System.in);

		for (int posicao = 0; posicao < nomes.length; posicao++) {
			System.out.print("Nome " + (posicao + 1) + ":");
			nomes[posicao] = ler.nextLine();
		}

		ler.reset();
	}
}