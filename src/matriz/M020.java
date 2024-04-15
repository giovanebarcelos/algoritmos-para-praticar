package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler dois vetores V1 e V2 de 5 números cada. Calcular e escrever
 * a quantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições.
 *
 * @author giovanebarcelos
 */

public class M020 {
	private static final int TAMANHOVETOR = 5;

	public static void main(String[] args) {
		int[] vetor1 = M020.lerVetor("Digite o Vetor 1");
		int[] vetor2 = M020.lerVetor("Digite o Vetor 2");

		int contaVezes = M020.contarVezesQueVetor1EVetor2PossuemMesmoNumeroNaMesmaPosicao(vetor1, vetor2);

		System.out.printf("O vetor 1 e vetor 2 possuem o mesmo número na mesma posição em %d posições!", contaVezes);
	}

	private static int contarVezesQueVetor1EVetor2PossuemMesmoNumeroNaMesmaPosicao(int[] vetor1, int[] vetor2) {
		int conta = 0;

		for (int posicao = 0; posicao < vetor1.length; posicao++) {
			if (vetor1[posicao] == vetor2[posicao]) {
				conta++;
			}
		}

		return conta;
	}

	private static int[] lerVetor(String mensagem) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[M020.TAMANHOVETOR];

		System.out.println(mensagem);
		for (int posicao = 0; posicao < M020.TAMANHOVETOR; posicao++) {
			System.out.print("Número " + (posicao + 1) + ": ");
			vetor[posicao] = ler.nextInt();
		}

		ler.reset();

		return vetor;
	}
}