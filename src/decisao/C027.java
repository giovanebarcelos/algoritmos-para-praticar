package decisao;

import java.util.Scanner;

/*
 * Escreva uma algoritmo que leia a idade de uma pessoa e informe se o voto é obrigatório,
 * não permitido ou facultativo para esta pessoa:
 * - Entre 18 e 70 anos de idades é obrigatório a votação;
 * - Entre 16 e 18 ou maior que 70 o voto é facultativo;
 * - Menor que 16 não pode votar.
 * 
 * @author giovanebarcelos
 */

public class C027 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = ler.nextInt();

		if (idade < 16) {
			System.out.println("Não pode votar!");
		} else if (idade < 18 || idade > 70) {
			System.out.println("Voto facultativo!");
		} else {
			System.out.println("Voto obrigatório!");
		}

		ler.close();
	}
}