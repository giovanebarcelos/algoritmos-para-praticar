package repeticao;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia indefinidamente números até que seja digitado o número
 * zero. Ao final imprimir o menor e o maior números lidos.
 * 
 * @author giovanebarcelos
 */

public class R002 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero;
		do {
			System.out.print("Número: ");
			numero = ler.nextInt();
		} while (numero != 0);

		ler.close();
	}
}