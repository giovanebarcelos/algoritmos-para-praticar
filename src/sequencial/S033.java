package sequencial;

import java.util.Scanner;

/*
 * Fazer um algoritmo para ajudar no cálculo do salário de um funcionário. O sistema deve pedir:
 * - nome do funcionário
 * - salário bruto
 * - número de dependentes
 * e deve mostrar:
 * - nome do funcionário e
 * - salário líquido
 * Considere a seguinte regra para o cálculo:
 * Salário Líquido = Salário Bruto – Desconto INSS + (15,00 * Número de Dependentes) +
 * Auxílio Passagem (40,00) + Auxílio Refeição (100,00)
 * 
 * Salário Bruto   Desconto INSS
 *                 (Percentual sobre o Salário Bruto)
 * Até 300          8,00%
 * De 301 a 700     9,00%
 * Acima 700       10,00%
 * 
 * @author giovanebarcelos
 */

public class S033 {
	private static final double AUXILIOREFEICAO = 15f;
	private static final double AUXILIOPASSAGEM = 40f;
	private static final double AUXILIOPORDEPENDENTE = 100f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Nome do Funcionário: ");
		String nomeDoFuncionario = ler.nextLine();

		System.out.print("Salário Bruto: ");
		double salarioBruto = ler.nextDouble();

		System.out.print("Número de Dependentes: ");
		int numeroDeDependentes = ler.nextInt();

		float descontoINSS = 0;
		if (salarioBruto < 301) {
			descontoINSS = 0.08f;
		} else if (salarioBruto < 701) {
			descontoINSS = 0.09f;
		} else {
			descontoINSS = 0.1f;
		}

		double salarioLiquido = salarioBruto - (salarioBruto * descontoINSS)
				+ (AUXILIOPORDEPENDENTE * numeroDeDependentes) + AUXILIOPASSAGEM + AUXILIOREFEICAO;

		System.out.printf("O salário líquido do funcionário %s é %.2f", nomeDoFuncionario, salarioLiquido);

		ler.close();
	}
}