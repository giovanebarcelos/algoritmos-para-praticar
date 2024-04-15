package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia dois valores numéricos e efetue a multiplicação entre eles,
 * caso o primeiro número seja menor que o segundo o resultado deve ser apresentado caso 
 * contrário deve ser apresentado o primeiro valor lido ao quadrado.
 * 
 * @author giovanebarcelos
 */

public class C001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		long numero1 = ler.nextLong();

		System.out.print("Número 2: ");
		long numero2 = ler.nextLong();

		if (numero1 < numero2) {
			System.out.printf("A multiplicação de %d por %d é %d", numero1, numero2, numero1 * numero2);
		} else {
			System.out.printf("O quadrado de %d é %d", numero1, Math.pow(numero1, 2));
		}

		ler.close();
	}
}