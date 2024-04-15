package decisao;

import java.util.Scanner;

/*
 * Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:
 * Fraldinha = 2 – 4 anos;
 * Infantil A = 5 - 7 anos;
 * Infantil B = 8-10 anos;
 * Juvenil A = 11-13 anos;
 * Juvenil B = 14-17 anos;
 * Adulto = maiores de 18 anos.
 * 
 * @author giovanebarcelos
 */

public class C037 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = ler.nextInt();

		String classificacao;
		if (idade < 2) {
			classificacao = "Sem Classificacao";
		} else if (idade < 5) {
			classificacao = "Fraldinha";
		} else if (idade < 8) {
			classificacao = "Infantil A";
		} else if (idade < 11) {
			classificacao = "Infantil B";
		} else if (idade < 14) {
			classificacao = "Juvenil A";
		} else if (idade < 18) {
			classificacao = "Juvenil B";
		} else {
			classificacao = "Adulto";
		}

		System.out.printf("Categoria do nadador é igual a %s", classificacao);

		ler.close();
	}
}