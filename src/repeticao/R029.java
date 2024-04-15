package repeticao;

import java.util.Scanner;

/*
 * Ler 10 valores e escrever quantos desses valores lidos estão no intervalo entre 5 e 15 e
 * quantos deles estão fora deste intervalo.
 * 
 * @author giovanebarcelos
 */

public class R029 {
	private static final int NUMEROSPARALER = 10;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numeros = NUMEROSPARALER, numero, numerosEntre5E15 = 0;

		while (numeros > 0) {
			System.out.print("Número: ");
			numero = ler.nextInt();

			if (numero >= 5 && numero <= 15) {
				numerosEntre5E15++;
			}

			numeros--;
		}

		System.out.printf("%d números estão entre 5 e 15 e %d estão fora deste intervalo", numerosEntre5E15,
				NUMEROSPARALER - numerosEntre5E15);

		ler.close();
	}
}