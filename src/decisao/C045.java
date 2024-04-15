package decisao;

import java.util.Scanner;

/*
 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga
 * se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa
 * nasceu).
 * 
 * @author giovanebarcelos
 */

public class C045 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Ano atual: ");
		int anoAtual = ler.nextInt();
		System.out.print("Ano nascimento: ");
		int anoNascimento = ler.nextInt();

		int idade = anoAtual - anoNascimento;

		if (idade < 16) {
			System.out.println("Não pode votar!");
		} else {
			System.out.println("Pode votar!");
		}

		ler.close();
	}
}