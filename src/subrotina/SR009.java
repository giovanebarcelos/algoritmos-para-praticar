package subrotina;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia uma data no formato dd/mm/aaaa (dd=Dia, mm=Mês e
 * aaaa=Ano) e depois exige esta data por extenso (Ex: 15 de Novembro de 2010). O
 * algoritmo deverá fazer uso de um vetor para armazenar os meses do ano e também deverá
 * utilizar uma função que irá receber a data caracter em formato dd/mm/aaaa e devolver a
 * data por extenso.
 *
 * @author giovanebarcelos
 */

public class SR009 {
	public static void main(String[] args) {
		String data = SR009.lerData(), dataPorExtenso = SR009.dataPorExtenso(data);

		System.out.printf("A data %s por extenso é %s", data, dataPorExtenso);
	}

	private static String dataPorExtenso(String data) {
		String[] mesesDoAno = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		String[] partes = data.split("/");

		return String.format("%s de %s de %s", partes[0], mesesDoAno[new Integer(partes[1]) - 1], partes[2]);
	}

	private static String lerData() {
		Scanner ler = new Scanner(System.in);
		String data = "";

		boolean dataValida = false;
		do {
			System.out.print("Digite a data no formato (dd/mm/aaaa): ");
			data = ler.next();

			dataValida = SR009.verificarValidadeDaData(data);

			if (!dataValida) {
				System.out.println("Redigite a data !");
			}
		} while (!dataValida);

		ler.close();

		return data;
	}

	private static boolean verificarValidadeDaData(String data) {
		boolean dataValida = true;
		String[] partes = data.split("/");
		int[] diasDoMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (partes.length == 3) {
			int dia = new Integer(partes[0]);
			int mes = new Integer(partes[1]);
			int ano = new Integer(partes[2]);

			if ((mes > 0) && (mes < 13)) {
				if (partes[2].length() == 4) {
					int diasRef = diasDoMes[mes - 1];

					// Ano bissexto
					if ((mes == 2) && ((ano % 4) == 0)) {
						diasRef = 29;
					}
					if ((dia < 1) || (dia > diasRef)) {
						dataValida = false;
						System.out.printf("Dia %d inválido para o Mês %d do Ano %d!", dia, mes, ano);
					}
				} else {
					dataValida = false;
					System.out.printf("Ano deve ter 4 digitos!", mes);
				}
			} else {
				dataValida = false;
				System.out.printf("Mês %d é inválido!", mes);
			}
		} else {
			dataValida = false;
			System.out.println("Formato de data inválido!");
		}

		return dataValida;
	}
}