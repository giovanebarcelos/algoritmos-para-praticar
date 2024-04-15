package sequencial;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia um número inteiro qualquer e ao final mostre na tela:
 * 1) O dobro do número que foi digitado
 * 2) A sua terça parte
 * 3) O seu antecessor
 * 4) O seu sucessor
 * 
 * @author giovanebarcelos 
 */

public class S005 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número:");
		int numero = ler.nextInt();

		System.out.printf("O dobro de %d é %d\n", numero, numero * 2);
		System.out.printf("A terça parte de %d é %.2f\n", numero, (float) numero / 3);
		System.out.printf("O antecessor de %d é %d\n", numero, numero - 1);
		System.out.printf("O sucessor de %d é %d", numero, numero + 1);

		ler.close();
	}
}
