package sequencial;

import java.util.Scanner;

/*
 * Entrar com o ano de nascimento de uma pessoa e o ano atual e, ao final imprimir a idade
 * da pessoa.
 * 
 * @author giovanebarcelos 
 */
public class S007 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Ano de nascimento:");
		int anoNascimento = ler.nextInt();

		System.out.print("Ano atual:");
		int anoAtual = ler.nextInt();

		int idade = anoAtual - anoNascimento;

		System.out.printf("A idade da pessoa é %d", idade);

		ler.close();
	}
}
