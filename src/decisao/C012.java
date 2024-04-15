package decisao;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia o dividendo e o divisor e informe se o quociente é inteiro e
 * se é par ou impar. 
 * 
 * @author giovanebarcelos
 */

public class C012 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Dividendo: ");
		long dividendo = ler.nextInt();

		System.out.print("Divisor: ");
		long divisor = ler.nextInt();

		double quociente = dividendo / divisor;
		long quocienteInteiro = (long) quociente;

		if (quociente == quocienteInteiro) {
			System.out.printf("Quociente %.2f é inteiro e ", quociente);

			if (quocienteInteiro % 2 == 0) {
				System.out.print("par!");
			} else {
				System.out.print("impar!");
			}
		}

		ler.close();
	}
}