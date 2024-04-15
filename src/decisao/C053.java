package decisao;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres. Calcule e escreva a
 * soma das idades do homem mais velho com a mulher mais nova, e o produto das idades
 * do homem mais novo com a mulher mais velha.
 * 
 * @author giovanebarcelos
 */

public class C053 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Idade homem 1: ");
		int idadeHomem1 = ler.nextInt();
		System.out.print("Idade homem 2: ");
		int idadeHomem2 = ler.nextInt();
		System.out.print("Idade mulher 1: ");
		int idadeMulher1 = ler.nextInt();
		System.out.print("Idade mulher 2: ");
		int idadeMulher2 = ler.nextInt();

		int idadeHomemMaisVelho;
		int idadeHomemMaisNovo;
		if (idadeHomem1 > idadeHomem2) {
			idadeHomemMaisVelho = idadeHomem1;
			idadeHomemMaisNovo = idadeHomem2;
		} else {
			idadeHomemMaisVelho = idadeHomem2;
			idadeHomemMaisNovo = idadeHomem1;
		}

		int idadeMulherMaisVelha;
		int idadeMulherMaisNova;
		if (idadeMulher1 > idadeMulher2) {
			idadeMulherMaisVelha = idadeMulher1;
			idadeMulherMaisNova = idadeMulher2;
		} else {
			idadeMulherMaisVelha = idadeMulher2;
			idadeMulherMaisNova = idadeMulher1;
		}

		int somaIdadesHomemMaisVelhoComMulherMaisNova = idadeHomemMaisVelho + idadeMulherMaisNova;
		int produtoIdadesHomemMaisNovoComMulherMaisVelha = idadeHomemMaisNovo * idadeMulherMaisVelha;

		System.out.printf("Soma das Idades da Homem mais Velho com a Mulher mais Nova é %d\n",
				somaIdadesHomemMaisVelhoComMulherMaisNova);
		System.out.printf("Produto das Idades do Homem mais Novo com a Mulher mais Velha é %d\n",
				produtoIdadesHomemMaisNovoComMulherMaisVelha);

		ler.close();
	}
}