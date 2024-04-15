package repeticao;

import java.util.Scanner;

/*
 * Foi feita uma pesquisa para determinar o índice de mortalidade infantil em um certo
 * período. Fazer um algoritmo que:
 * - leia inicialmente o número de crianças nascidas no período;
 * - leia, em seguida um número indeterminado de linhas, contendo, cada uma, o sexo de
 * uma criança morta (masculino, feminino) e o número de meses de vida da criança. A
 * última linha, que não entrará nos cálculos, contém no lugar do sexo a palavra “vazio”;
 * - determine e imprima:
 * a) a porcentagem de crianças mortas no período;
 * b) a porcentagem de crianças do sexo masculino mortas no período;
 * c) a porcentagem de crianças que viveram 24 meses ou menos no período.
 * 
 * @author giovanebarcelos
 */

public class R044 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número de crianças nascidas no período: ");
		long numeroCriancas = ler.nextLong();

		boolean continuar;
		int criancasMortas = 0, criancasMortasMasculinas = 0, criancasViveramMenosOuIgualA24Meses = 0;
		do {
			System.out.print("Sexo (M/F): ");
			String sexo = ler.next();

			System.out.print("Meses: ");
			int meses = ler.nextInt();

			continuar = !"vazio".equalsIgnoreCase(sexo);

			if (continuar) {
				criancasMortas++;
				if ("M".equalsIgnoreCase(sexo)) {
					criancasMortasMasculinas++;
				}

				if (meses <= 24) {
					criancasViveramMenosOuIgualA24Meses++;
				}

			}
		} while (continuar);

		System.out.println("Estatísticas:");
		System.out.printf("Crianças mortas no período: %.2f%%\n", criancasMortas / (float) numeroCriancas * 100);
		System.out.printf("Crianças mortas sexo masculino: %.2f%%\n",
				criancasMortasMasculinas / (float) numeroCriancas * 100);
		System.out.printf("Crianças quer viveram 24 meses ou menos: %.2f%%\n",
				criancasViveramMenosOuIgualA24Meses / (float) numeroCriancas * 100);

		ler.close();
	}
}