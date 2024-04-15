package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
 * diferente de um código armazenado internamente no algoritmo (igual a 1308) deve ser
 * apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido
 * outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser
 * mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a
 * mensagem ‘Acesso permitido’.
 * 
 * @author giovanebarcelos
 */

public class C055 {

	private static final int CODIGODOUSUARIO = 1308;
	private static final int SENHA = 9999;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Código do Usuário: ");
		int codigoDoUsuario = ler.nextInt();

		if (codigoDoUsuario == CODIGODOUSUARIO) {
			System.out.print("Senha: ");
			int senha = ler.nextInt();

			if (senha == SENHA) {
				System.out.println("Acesso Permitido!");
			} else {
				System.out.println("Senha Incorreta!");
			}
		} else {
			System.out.println("Usuário Inválido!");
		}

		ler.close();
	}
}
