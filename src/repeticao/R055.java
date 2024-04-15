package repeticao;

import java.util.Scanner;

/*
 * Numa fábrica trabalham homens e mulheres divididos em três classes:
 * A – os que fazem até 30 peças por mês;
 * B – os que fazem de 31 a 35 peças por mês;
 * C – os que fazem mais de 35 peças por mês;
 * A classe A recebe salário-mínimo. A classe B recebe salário-mínimo e mais 3% do saláriomínimo
 * por peça, acima das 30 iniciais. A classe C recebe salário-mínimo e mais 5% do
 * salário- mínimo por peça acima das 30 iniciais.
 * Fazer um algoritmo que:
 * a) leia várias linhas, contendo cada uma:
 * - o número do operário;
 * - o número de peças fabricadas por mês;
 * - o sexo do operário;
 * b) calcule e escreva
 * - o salário de cada operário;
 * - o total da folha mensal de pagamento da fábrica;
 * - o número total de peças fabricadas por mês;
 * - a média de peças fabricadas pelos homens em cada classe;
 * - a média de peças fabricadas pelas mulheres em cada classe;
 * - o número do operário ou operária de maior salário (não existe empate).
 * Observação: A última linha, que servirá de sinalizador de finalização, terá o número do
 * operário igual a zero.
 * 
 * @author giovanebarcelos
 */

public class R055 {
	private static final double SALARIOMINIMO = 1000f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		long nroOperario = 0, totalPecasFabricadas = 0, totalHomens = 0, totalPecasHomemClasseA = 0,
				totalPecasHomemClasseB = 0, totalPecasHomemClasseC = 0, totalMulheres = 0, totalPecasMulherClasseA = 0,
				totalPecasMulherClasseB = 0, totalPecasMulherClasseC = 0, nroOperarioMaiorSalario = 0;
		double totalFolhaPagto = 0f, maiorSalario = 0;
		do {
			System.out.print("Número do Operário: ");
			nroOperario = ler.nextLong();
			if (nroOperario != 0) {
				System.out.print("Peças fabricadas por mês: ");
				int pecasFabricadas = ler.nextInt();
				System.out.print("Sexo (M/F)? ");
				String sexo = ler.next();

				String classeOperario = "";
				double salario = 0;
				if (pecasFabricadas <= 30) {
					classeOperario = "A";
					salario = SALARIOMINIMO;
				} else if (pecasFabricadas <= 35) {
					classeOperario = "B";
					salario = SALARIOMINIMO * 1.03;
				} else {
					classeOperario = "C";
					salario = SALARIOMINIMO * 1.05;
				}

				if (maiorSalario < salario) {
					maiorSalario = salario;
					nroOperarioMaiorSalario = nroOperario;
				}

				totalFolhaPagto += salario;
				totalPecasFabricadas += pecasFabricadas;

				if ("M".equalsIgnoreCase(sexo)) {
					totalHomens++;
					totalPecasHomemClasseA += "A".equalsIgnoreCase(classeOperario) ? 1 : 0;
					totalPecasHomemClasseB += "B".equalsIgnoreCase(classeOperario) ? 1 : 0;
					totalPecasHomemClasseC += "C".equalsIgnoreCase(classeOperario) ? 1 : 0;
				} else {
					totalMulheres++;
					totalPecasMulherClasseA += "A".equalsIgnoreCase(classeOperario) ? 1 : 0;
					totalPecasMulherClasseB += "B".equalsIgnoreCase(classeOperario) ? 1 : 0;
					totalPecasMulherClasseC += "C".equalsIgnoreCase(classeOperario) ? 1 : 0;
				}

				System.out.printf("Salário = %.2f\n", salario);
			}
		} while (nroOperario != 0);
		System.out.println("Estatísticas: ");

		System.out.printf("Total da folha mensal de pagamento da fábrica = %.2f\n", totalFolhaPagto);
		System.out.printf("Número total de peças fabricadas por mês = %d\n", totalPecasFabricadas);
		System.out.printf("Média de peças fabricadas pelos homens em cada classe: A (%d), B (%d), C (%d)\n",
				totalPecasHomemClasseA / (totalHomens == 0 ? 1 : totalHomens),
				totalPecasHomemClasseB / (totalHomens == 0 ? 1 : totalHomens),
				totalPecasHomemClasseC / (totalHomens == 0 ? 1 : totalHomens));
		System.out.printf("Média de peças fabricadas pelas mulheres em cada classe: A (%d), B (%d), C (%d)\n",
				totalPecasMulherClasseA / (totalMulheres == 0 ? 1 : totalMulheres),
				totalPecasMulherClasseB / (totalMulheres == 0 ? 1 : totalMulheres),
				totalPecasMulherClasseC / (totalMulheres == 0 ? 1 : totalMulheres));
		System.out.printf("O operário de maior salário é %d e possui salário %.2f", nroOperarioMaiorSalario,
				maiorSalario);

		ler.close();
	}
}