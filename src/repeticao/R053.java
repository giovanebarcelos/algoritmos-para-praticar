package repeticao;

import java.util.Scanner;

/*
 * Numa certa loja de eletrodomésticos, o comerciário encarregado da seção de televisores
 * recebe, mensalmente, um salário fixo mais comissão. Essa comissão é calculada em
 * relação ao tipo e ao número de televisores vendidos por mês, obedecendo à tabela abaixo:
 * Tipo             No de Televisores Vendidos   Comissões
 * A Cores          Maior ou igual a 10          R$ 100,00 por televisor vendido
 *                  Menor do que 10              R$ 50,00 por televisor vendido 
 * Preto e Branco   Maior ou igual a 20          R$ 40,00 por televisor vendido
 *                  Menor do que 20              R$ 20,00 por televisor vendido 
 * 
 * Sabe-se, ainda, que ele tem um desconto de 8% sobre seu salário fixo para o INSS. Se o
 * seu salário total (fixo + comissões – INSS) for maior ou igual a R$ 3.000,00 ele ainda terá
 * um desconto de 5%, sobre esse salário total, relativo ao imposto de renda retido na fonte.
 * Sabendo-se que existem 20 empregados nesta seção, leia o valor do salário fixo e, para
 * cada comerciário, o número de sua inscrição, o número de televisores a cores e o número
 * de televisores preto e branco vendidos; calcule e escreva o número de inscrição de cada
 * empregado, seu salário bruto e seu salário líquido.
 * 
 * @author giovanebarcelos
 */

public class R053 {
	private static final int NROEMPREGADOS = 20;
	private static final double COMISSAOTVCORESMENORQ10VENDIDOS = 50f;
	private static final double COMISSAOTVCORESMAIORQ10VENDIDOS = 100f;
	private static final double COMISSAOTVPBMENORQ20VENDIDOS = 20f;
	private static final double COMISSAOTVPBMAIORQ20VENDIDOS = 40f;
	private static final double FATORINSS = 0.08f;
	private static final double LIMITEIMPOSTODERENDA = 3000f;
	private static final double FATORDESCONTOIMPOSTORENDA = 0.05f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		for (int empregado = 1; empregado <= NROEMPREGADOS; empregado++) {
			System.out.print("Nro Inscrição: ");
			String nroInscricao = ler.nextLine();
			System.out.print("Salário Bruto: ");
			double salarioBruto = ler.nextDouble();
			System.out.print("Televisores a cores vendidos: ");
			long qtdeTVCores = ler.nextLong();
			System.out.print("Televisores preto e branco vendidos: ");
			long qtdeTVPB = ler.nextLong();

			// tratamento de salto incondicional
			ler.nextLine();

			double inss = salarioBruto * FATORINSS;
			double comissao = 0;
			comissao += qtdeTVCores
					* (qtdeTVCores < 10 ? COMISSAOTVCORESMENORQ10VENDIDOS : COMISSAOTVCORESMAIORQ10VENDIDOS);
			comissao += qtdeTVPB * (qtdeTVPB < 20 ? COMISSAOTVPBMENORQ20VENDIDOS : COMISSAOTVPBMAIORQ20VENDIDOS);

			double salarioLiquido = salarioBruto + comissao - inss;

			if (salarioBruto >= LIMITEIMPOSTODERENDA) {
				salarioLiquido *= FATORDESCONTOIMPOSTORENDA;
			}

			System.out.printf(
					"O funcionário com inscrição %s tem salário bruto igual a %.2f e líquido igual a %.2f\n\n",
					nroInscricao, salarioBruto, salarioLiquido);
		}

		ler.close();
	}
}