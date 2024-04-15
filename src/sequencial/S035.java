package sequencial;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês
 * com 30 dias.
 * 
 * @author giovanebarcelos
 */

public class S035 {
	private static final int DIASPORANO = 365;
	private static final int DIASPORMES = 30;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Idade");
		System.out.print("Anos: ");
		int anos = ler.nextInt();
		System.out.print("Meses: ");
		int meses = ler.nextInt();
		System.out.print("Dias: ");
		int dias = ler.nextInt();

		int diasDeVida = anos * DIASPORANO + meses * DIASPORMES + dias;

		System.out.println("Possui " + diasDeVida + " dias de vida!");

		ler.close();
	}
}
