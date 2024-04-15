package decisao;

import java.util.Scanner;

/*
 * Desenvolva um algoritmo que ao entrar com um número informe se sua raiz quadrada é inteira.
 * 
 * @author giovanebarcelos
 */

public class C009 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número: ");
		long numero = ler.nextInt();

		double raizNumero = Math.sqrt(numero);

		if (raizNumero == (long) raizNumero) {
			System.out.printf("A raiz quadrada do número %d é inteira!", numero);
		} else {
			System.out.printf("A raiz quadrada do número %d não é inteira!", numero);
		}

		ler.close();
	}
}
