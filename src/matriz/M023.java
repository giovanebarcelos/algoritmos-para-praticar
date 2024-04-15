package matriz;

import java.util.Scanner;

/*
 * A comissão organizadora de um rallye automobilístico decidiu apurar os resultados da
 * competição através de um processamento eletrônico.
 * Um dos algoritmos necessários para a classificação das equipes concorrentes é o que
 * emite uma listagem geral do desempenho das equipes, atribuindo pontos segundo
 * determinadas normas:
 * O algoritmo deverá:
 * a) Ler:
 * a.1) uma linha contendo os tempos padrão (em minutos decimais) para as três fases de
 * competição;
 * a.2) um conjunto de linhas contendo cada uma o número de inscrição da equipe e os
 * tempos (em minutos decimais) que as mesmas despenderam ao cumprir as três diferentes
 * etapas. A última linha (flag), que não entrará nos cálculos, contém o número 9999 como
 * número de inscrição.
 * b) Calcular:
 * b.1) os pontos de cada equipe em cada uma das etapas, seguindo o seguinte critério: Seja
 * Δ o valor absoluto da diferença entre o tempo-padrão (lido na primeira linha) e o tempo
 * despendido pela equipe numa etapa:
 * Δ < 3 minutos – atribuir 100 pontos à etapa
 * 3 <= Δ <= 5 minutos – atribuir 80 pontos à etapa
 * Δ > 5 minutos – atribuir 80 – (Δ - 5)/5 pontos à etapa
 * b.2) o total de pontos de cada equipe nas três etapas;
 * b.3) a equipe vencedora.
 * c) Escrever:
 * c.1) para cada equipe, o número de inscrição, os pontos obtidos em cada etapa e o total de
 * pontos obtidos.
 *
 * @author giovanebarcelos
 */

public class M023 {
	private static final int INSCRICAO = 0;
	private static final int TEMPOETAPA3 = 3;
	private static final int TEMPOETAPA2 = 2;
	private static final int TEMPOETAPA1 = 1;
	private static final int TAMANHOMATRIZ = 100;
	private static final int POSICAOINSCRICAOEQUIPE = 0;
	private static final int POSICAOTEMPOETAPA1 = 1;
	private static final int POSICAOTEMPOETAPA2 = 2;
	private static final int POSICAOTEMPOETAPA3 = 3;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		long[][] temposEquipe = new long[M023.TAMANHOMATRIZ][4];
		boolean continuar = true;

		System.out.print("Tempo padrão Etapa 1 em minutos: ");
		long tempoEtapa1 = ler.nextLong();
		System.out.print("Tempo padrão Etapa 2 em minutos: ");
		long tempoEtapa2 = ler.nextLong();
		System.out.print("Tempo padrão Etapa 3 em minutos: ");
		long tempoEtapa3 = ler.nextLong();

		for (int posicao = 0; (posicao < M023.TAMANHOMATRIZ) && continuar; posicao++) {
			System.out.print("Inscrição Equipe: ");
			temposEquipe[posicao][M023.POSICAOINSCRICAOEQUIPE] = ler.nextLong();

			continuar = (temposEquipe[posicao][M023.POSICAOINSCRICAOEQUIPE] != 9999);

			if (continuar) {
				System.out.print("Tempo Etapa 1: ");
				temposEquipe[posicao][M023.POSICAOTEMPOETAPA1] = ler.nextLong();
				System.out.print("Tempo Etapa 2: ");
				temposEquipe[posicao][M023.POSICAOTEMPOETAPA2] = ler.nextLong();
				System.out.print("Tempo Etapa 3: ");
				temposEquipe[posicao][M023.POSICAOTEMPOETAPA3] = ler.nextLong();
			}
		}

		String[] rotulos = { "Inscrição", "Etapa 1", "Etapa 2", "Etapa 3", "Ptos Etapa 1", "Ptos Etapa 2",
				"Ptos Etapa 3", "Total Pontos" };

		M023.imprimirCabecalho(rotulos);

		long equipeVencedora = 0, totalPontosEquipeVencedora = 0;
		for (int posicao = 0; temposEquipe[posicao][M023.INSCRICAO] != 9999; posicao++) {
			long[] equipe = temposEquipe[posicao];

			// Dados Equipe
			System.out.println();
			System.out.printf("%" + rotulos[M023.INSCRICAO].length() + "d ", equipe[M023.INSCRICAO]);
			System.out.printf("%" + rotulos[M023.TEMPOETAPA1].length() + "d ", equipe[M023.TEMPOETAPA1]);
			System.out.printf("%" + rotulos[M023.TEMPOETAPA2].length() + "d ", equipe[M023.TEMPOETAPA2]);
			System.out.printf("%" + rotulos[M023.TEMPOETAPA3].length() + "d ", equipe[M023.TEMPOETAPA3]);

			// Calculos Equipe
			long ptosEtapa1 = M023.pontosDaEtapa(tempoEtapa1, equipe[M023.TEMPOETAPA1]);
			long ptosEtapa2 = M023.pontosDaEtapa(tempoEtapa2, equipe[M023.TEMPOETAPA2]);
			long ptosEtapa3 = M023.pontosDaEtapa(tempoEtapa3, equipe[M023.TEMPOETAPA3]);
			long totalPontosDaEquipe = ptosEtapa1 + ptosEtapa2 + ptosEtapa3;

			System.out.printf("%" + rotulos[4].length() + "d ", ptosEtapa1);
			System.out.printf("%" + rotulos[5].length() + "d ", ptosEtapa2);
			System.out.printf("%" + rotulos[6].length() + "d ", ptosEtapa3);
			System.out.printf("%" + rotulos[7].length() + "d ", totalPontosDaEquipe);

			if (totalPontosEquipeVencedora < totalPontosDaEquipe) {
				totalPontosEquipeVencedora = totalPontosDaEquipe;
				equipeVencedora = equipe[M023.INSCRICAO];
			}
		}

		System.out.printf("\n\nA equipe vencedora teve %d pontos e tem código de inscrição igual a %d\n",
				totalPontosEquipeVencedora, equipeVencedora);

		ler.close();
	}

	private static long pontosDaEtapa(long tempoPadrao, long tempoEquipe) {
		long pontos = 0, delta = Math.abs(tempoPadrao - tempoEquipe);

		if (delta < 3) {
			pontos = 100;
		} else if (delta <= 5) {
			pontos = 80;
		} else {
			pontos = 80 - ((delta - 5) / 5);
		}

		return pontos;
	}

	private static void imprimirCabecalho(String[] rotulos) {
		System.out.println();
		for (String rotulo : rotulos) {
			System.out.printf("%s ", rotulo);
		}

		M023.imprimirSeparacao(rotulos);
	}

	private static void imprimirSeparacao(String[] rotulos) {
		System.out.println();

		for (String rotulo : rotulos) {
			System.out.printf("%s ", M023.repetir("-", rotulo.length()));
		}
	}

	private static String repetir(String str, int tamanho) {
		String strNovo = "";

		while (tamanho > 0) {
			strNovo += str;
			tamanho--;
		}

		return strNovo;
	}
}