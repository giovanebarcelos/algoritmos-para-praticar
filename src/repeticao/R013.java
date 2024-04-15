package repeticao;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler o saldo de 10 (dez) clientes de um banco.
 * Calcular e mostrar:
 * - o saldo médio dos clientes
 * - a porcentagem de clientes com saldo devedor.
 * - o número de clientes com saldo credor.
 * 
 * @author giovanebarcelos
 */

public class R013 {
	private static final int QTDECLIENTES = 10;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double saldo, saldoMedio = 0;
		int qtdeClientesComSaldoDevedor = 0;
		for (int cliente = 1; cliente <= QTDECLIENTES; cliente++) {
			System.out.print("Saldo do Cliente " + cliente + ": ");
			saldo = ler.nextDouble();

			saldoMedio += saldo;

			if (saldo < 0) {
				qtdeClientesComSaldoDevedor++;
			}
		}

		System.out.println("Estatísticas dos Clientes:");
		System.out.printf("Saldo medio = %.2f\n", saldoMedio / QTDECLIENTES);
		System.out.printf("Clientes com saldo devedor = %.2f%%\n",
				qtdeClientesComSaldoDevedor / (float) QTDECLIENTES * 100);
		System.out.printf("Número de clientes com saldo credor = %d\n", QTDECLIENTES - qtdeClientesComSaldoDevedor);

		ler.close();
	}
}