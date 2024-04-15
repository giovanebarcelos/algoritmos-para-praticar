package decisao;

import java.util.Scanner;

/*
 * Fazer um algoritmo para ajudar a bilheteria do metrô. O operador deve informar o tipo do
 * bilhete (unitário, duplo ou 10 viagens) e o valor pago pelo passageiro. O sistema deve
 * mostrar, então, a quantidade de bilhetes possíveis e o troco que o passageiro deve receber.
 * Considere a seguinte tabela de preço:
 * Bilhete unitário ....................................................................... 1,30
 * Bilhete duplo .......................................................................... 2,60
 * Bilhete de 10 viagens .................................................................. 12,00
 * 
 * @author giovanebarcelos
 *  */

public class C043 {
	public static void main(String[] args) {
		System.out.println("Tipo de Bilhete");
		System.out.println("1. Bilhete Unitário   -  1,30");
		System.out.println("2. Bilhete Duplo      -  2,60");
		System.out.println("3. Bilhote 10 viagens - 12,00");

		Scanner ler = new Scanner(System.in);

		System.out.print("Tipo de Bilhete: ");
		byte tipoBilhete = ler.nextByte();

		System.out.print("Quantidade: ");
		int quantidade = ler.nextInt();

		System.out.print("Valor Pagamento Cliente: ");
		double valorPago = ler.nextDouble();

		double valorBilhete;
		if (tipoBilhete == 1) {
			valorBilhete = 1.3f;
		} else if (tipoBilhete == 2) {
			valorBilhete = 2.6f;
		} else {
			valorBilhete = 12.0f;
		}

		double valorCobranca = valorBilhete * quantidade;

		if (valorPago < valorCobranca) {
			System.out.printf("Valor Pago (%.2f) é inferior ao Valor de Cobranca (%.2f)!", valorPago, valorCobranca);
		} else {
			System.out.printf("Troco = %.2f", valorPago - valorCobranca);
		}

		ler.close();
	}
}