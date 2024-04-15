package decisao;

import java.util.Calendar;
import java.util.Scanner;

/*
 * Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou
 * não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
 * - Ter no mínimo 65 anos de idade.
 * - Ter trabalhado no mínimo 30 anos.
 * - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
 * Com base nas informações acima, faça um algoritmo que leia: o número do empregado
 * (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá
 * escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer
 * aposentadoria' ou 'Não requerer'.
 * 
 * @author giovanebarcelos
 */

public class C057 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Código do Empregado: ");
		int codigoEmpregado = ler.nextInt();
		System.out.print("Ano do nascimento: ");
		int anoNascimento = ler.nextInt();
		System.out.print("Ano de ingresso na empresa: ");
		int anoIngressoEmpresa = ler.nextInt();

		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

		int idade = anoAtual - anoNascimento;
		int tempoTrabalho = anoAtual - anoIngressoEmpresa;

		System.out.printf("Informacoes funcionário - Código %d\n", codigoEmpregado);
		System.out.printf("Idade = %d\n", idade);
		System.out.printf("Tempo de Trabaho = %d\n", tempoTrabalho);
		if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
			System.out.println("Requerer Aposentadoria!");
		} else {
			System.out.println("Não Requerer Aposentadoria!");
		}

		ler.close();
	}
}