package repeticao;

import java.util.Scanner;

/*
 * Fazer um algoritmo que:
 * - Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo. A
 * última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
 * - Calcule e escreva a idade média deste grupo de indivíduos.
 * 
 * @author giovanebarcelos
 */

public class R037 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		long somaIdades = 0, idade, contaIdades = 0;
		do {
			System.out.print("Idade: ");
			idade = ler.nextInt();

			if (idade > 0) {
				contaIdades++;
				somaIdades += idade;
			}

		} while (idade > 0);

		System.out.printf("Média das idades = %d", somaIdades / contaIdades);

		ler.close();
	}
}