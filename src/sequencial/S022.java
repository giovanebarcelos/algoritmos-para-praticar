package sequencial;

import java.util.Scanner;

/*
 * Um   programa   para   gerenciar   os   saques   de   um   caixa   eletrônico   deve   possuir   algum
 * mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado
 * para o cliente que realizou o saque. Um possível critério seria o da "distribuição ótima" no
 * sentido de que as notas de menor valor fossem distribuídas em número mínimo possível.
 * Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria indicar uma nota
 * de   R$   50,00,  três   notas   de  R$   10,00,  uma   nota   de   R$   5,00  e   duas   notas   de   R$  1,00.
 * Escreva um programa que receba o valor da quantia solicitada e retorne a distribuição das
 * notas de acordo com o critério da distribuição ótima.
 * 
 * @author giovanebarcelos
 */

public class S022 {
	private static final long NOTA100 = 100;
	private static final long NOTA50 = 50;
	private static final long NOTA10 = 10;
	private static final long NOTA5 = 5;
	private static final long NOTA1 = 1;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Valor Saque: ");
		long valorSaque = ler.nextLong();

		long qtdeNotas100 = valorSaque / NOTA100;
		long saldo = valorSaque - (qtdeNotas100 * NOTA100);

		long qtdeNotas50 = saldo / NOTA50;
		saldo -= qtdeNotas50 * NOTA50;

		long qtdeNotas10 = saldo / NOTA10;
		saldo -= qtdeNotas10 * NOTA10;

		long qtdeNotas5 = saldo / NOTA5;
		saldo -= qtdeNotas5 * NOTA5;

		long qtdeMoedas1 = saldo / NOTA1;

		System.out.printf("Para um saque de %d são necessárias: \n" + "%d notas de " + NOTA100 + "\n" + "%d notas de "
				+ NOTA50 + "\n" + "%d notas de " + NOTA10 + "\n" + "%d notas de " + NOTA5 + "\n" + "%d moedas de "
				+ NOTA1 + "\n", valorSaque, qtdeNotas100, qtdeNotas50, qtdeNotas10, qtdeNotas5, qtdeMoedas1);

		ler.close();

	}
}
