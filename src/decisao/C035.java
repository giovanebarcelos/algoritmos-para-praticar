package decisao;

import java.util.Scanner;

/*
 * Elabore um algoritmo que escreva qual o dia do ano, para uma dada data introduzida pelo
 * usuário. O algoritmo recebe o dia, o mês e o ano de depois mostra o dia do ano. Por
 * exemplo, 23/02/2010 corresponde ao dia 54 do ano.
 * 
 * @author giovanebarcelos
 */

public class C035 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Dia: ");
		int dia = ler.nextInt();
		System.out.print("Mês: ");
		int mes = ler.nextInt();
		System.out.print("Ano: ");
		int ano = ler.nextInt();

		long dias = dia;

		if (mes > 1)
			dias += 31;
		if (mes > 2)
			dias += ano % 4 == 0 ? 29 : 28;
		if (mes > 3)
			dias += 31;
		if (mes > 4)
			dias += 30;
		if (mes > 5)
			dias += 31;
		if (mes > 6)
			dias += 30;
		if (mes > 7)
			dias += 31;
		if (mes > 8)
			dias += 31;
		if (mes > 9)
			dias += 30;
		if (mes > 10)
			dias += 31;
		if (mes > 11)
			dias += 30;

		System.out.printf("%d/%d/%d equivale a %d dias", dia, mes, ano, dias);
		ler.close();
	}
}
