package subrotina;

import java.util.Scanner;

/*
 * Escreva uma função que deve substituir a ocorrência de uma cadeira de caracteres por
 * outra. O primeiro parâmetro deve conter a cadeira de caracteres a ser alterada, o segundo a
 * cadeia ser pesquisada e o terceiro a nova cadeia de caracteres. Esta função deve retornar o
 * novo valor. Exemplo: substitua(“Aula13”, “13”, “12”) → Resultado: Aula13
 *
 * @author giovanebarcelos
 */

public class SR020 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Palavra ou Frase: ");
		String frase = ler.nextLine();
		System.out.print("Pesquisar por: ");
		String pesquisar = ler.nextLine();
		System.out.print("Substituir por: ");
		String substituir = ler.nextLine();

		String novaPalavra = SR020.substitua(frase, pesquisar, substituir);

		System.out.printf("Nova Palavra = %s", novaPalavra);

		ler.close();
	}

	private static String substitua(String frase, String pesquisar, String substituir) {
		char[] fraseA = frase.toCharArray(), pesquisarA = pesquisar.toCharArray();
		String novaFrase = "";

		for (int posicao = 0; posicao < fraseA.length; posicao++) {
			if (fraseA[posicao] == pesquisarA[0]) {
				if (SR020.fraseDoInicioIgualAPesquisar(fraseA, posicao, pesquisarA)) {
					novaFrase += substituir;
					posicao += pesquisar.length() - 1;
				}
			} else {
				novaFrase += fraseA[posicao];
			}
		}

		return novaFrase;
	}

	private static boolean fraseDoInicioIgualAPesquisar(char[] fraseA, int posicao, char[] pesquisarA) {
		boolean ehIgual = (fraseA[posicao] == pesquisarA[0]);

		for (int posicaoPesquisa = 1; ehIgual && (posicaoPesquisa < pesquisarA.length); posicaoPesquisa++) {
			posicao++;
			ehIgual = (posicao < fraseA.length) && (fraseA[posicao] == pesquisarA[0]);
		}

		return ehIgual;
	}
}