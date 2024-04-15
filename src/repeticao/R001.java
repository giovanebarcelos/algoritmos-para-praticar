package repeticao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia um valor de referência, um número inicial e outro final.
 * Informe se o valor de referência encontra-se entre o número inicial e o final digitados
 * 
 * @author giovanebarcelos 
 */

public class R001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número de Referência: ");
		int numeroReferencia = ler.nextInt();
		System.out.print("Número Inicial: ");
		int numeroInicial = ler.nextInt();
		System.out.print("Número Final: ");
		int numeroFinal = ler.nextInt();

		if (numeroReferencia >= numeroInicial && numeroReferencia <= numeroFinal) {
			System.out.printf("Número %d esta entre %d e %d", numeroReferencia, numeroInicial, numeroFinal);
		} else {
			System.out.printf("Número %d não esta entre %d e %d", numeroReferencia, numeroInicial, numeroFinal);
		}

		ler.close();
	}
}