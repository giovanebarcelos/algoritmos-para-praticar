package decisao;

import java.util.Scanner;

/*
 * O departamento que controla o índice de poluição do meio ambiente mantém 3 grupos de
 * indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
 * varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1o grupo são intimadas a
 * suspenderem suas atividades, se o índice cresce para 0,4 as do 1o e 2o grupo são
 * intimadas a suspenderem suas atividades e se o índice atingir 0,5 todos os 3 grupos devem
 * ser notificados a paralisarem suas atividades. Fazer um algoritmo que lê o índice de
 * poluição medido e emitir a notificação adequada aos diferentes grupos de empresas,
 * sabendo-se que a escala varia de 0.05
 * 
 * @author giovanebarcelos
 */

public class C033 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Índice de poluição: ");
		float indicePoluicao = ler.nextFloat();

		if (indicePoluicao < 0.25) {
			System.out.println("Índice de poluição aceitável!");
		} else if (indicePoluicao < 0.4) {
			System.out.println("Indústrias do 1o grupo devem suspender as atividades!");
		} else if (indicePoluicao < 0.5) {
			System.out.println("Indústrias do 1o e 2o grupo devem suspender as atividades!");
		} else {
			System.out.println("Indústrias do 1o, 2o e 3o grupo devem suspender as atividades!");
		}

		ler.close();
	}
}