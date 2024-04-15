package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após,
 * calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se
 * saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever
 * a mensagem 'Saldo Negativo'.
 * 
 * @author giovanebarcelos
 */

public class C047 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número da conta do cliente: ");
		String numeroConta = ler.next();

		System.out.print("Saldo: ");
		double saldo = ler.nextDouble();

		System.out.print("Débito: ");
		double debito = ler.nextDouble();

		System.out.print("Crédito: ");
		double credito = ler.nextDouble();

		double saldoAtual = saldo - debito + credito;

		if (saldoAtual >= 0) {
			System.out.printf("Saldo Positivo para conta %s!", numeroConta);
		} else {
			System.out.printf("Saldo Negativo para conta %s!", numeroConta);
		}

		ler.close();
	}
}