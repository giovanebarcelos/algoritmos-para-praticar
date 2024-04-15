package sequencial;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia dois valores e mostre o ponto percentual de acréscimo ou
 * diminuição que ocorreu entre o primeiro e segundo valor.
 * 
 * @author giovanebarcelos 
 */
public class S004 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Valor 1:");
		float valor1 = ler.nextFloat();

		System.out.print("Valor 2:");
		float valor2 = ler.nextFloat();

		float fator = valor2 / valor1;

		System.out.printf("O fator de acréscimo ou diminuição entre %.2f e %.2f foi %.2f", valor1, valor2, fator);

		ler.close();
	}
}