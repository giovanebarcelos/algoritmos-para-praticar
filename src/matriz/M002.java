package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia o destino do passageiro, se a viagem inclui retorno (ida e
 * volta) e informe o preço da passagem conforme a tabela abaixo.
 * DESTINO              IDA        IDA E VOLTA
 * Região Norte         R$ 500,00  R$ 900,00
 * Região Nordeste      R$ 350,00  R$ 650,00
 * Região Centro-Oeste  R$ 350,00  R$ 600,00
 * Região Sul           R$ 300,00  R$ 550,00
 * 
 * @author giovanebarcelos
 */

public class M002 {
	private static final int IDA = 0;
	private static final int IDAEVOLTA = 1;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] destinos = { "Região Norte", "Região Nordeste", "Região Centro-Oeste", "Região Sul" };
		double[][] precos = { { 500f, 350f, 350f, 300f }, { 900f, 650f, 600f, 550f } };

		System.out.println("Escolha o Destino do Passageiro: ");
		for (int posicao = 0; posicao < destinos.length; posicao++) {
			System.out.printf("%d) %s\n", posicao + 1, destinos[posicao]);
		}
		System.out.print("Opção: ");
		int destino = ler.nextInt() - 1;
		System.out.print("Ida e Volta (S/N)? ");
		String idaEVolta = ler.next();

		double precoPassagem;
		if ("S".equalsIgnoreCase(idaEVolta)) {
			precoPassagem = precos[IDAEVOLTA][destino];
		} else {
			precoPassagem = precos[IDA][destino];
		}

		System.out.printf("O preço da passagem é %.2f", precoPassagem);

		ler.close();
	}
}