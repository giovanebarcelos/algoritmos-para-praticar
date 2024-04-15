package subrotina;

import java.util.Scanner;

/*
 * Escreva uma função que retorne o dia do ano ao receber uma data no formato
 * “dd/mm/aaaa”, onde, dd=dia, mm=mês e aaaa=ano. Exemplo: 23/02/2003 corresponde ao
 * dia 54 do ano.
 *
 */

public class SR019 {

	private static final int[] DIASDOMES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		String data = SR019.lerData();

		int diaDoAno = SR019.diaDoAno(data);

		System.out.printf("dia %d do ano correspondente a data %s", diaDoAno, data);
	}

	private static int diaDoAno(String data) {
		String[] partes = data.split("/");
		int diaDoAno = new Integer(partes[0]);
		int mes = new Integer(partes[1]) - 1;
		int ano = new Integer(partes[2]);

		while (mes > 0) {
			// ano bissexto
			if ((mes == 2) && ((ano % 4) == 0)) {
				diaDoAno += 29;
			} else {
				diaDoAno += SR019.DIASDOMES[mes - 1];
			}
			mes--;
		}

		return diaDoAno;
	}

	private static String lerData() {
		Scanner ler = new Scanner(System.in);
		String data = "";

		boolean dataValida = false;
		do {
			System.out.print("Digite a data no formato (dd/mm/aaaa): ");
			data = ler.next();

			dataValida = SR019.verificarValidadeDaData(data);

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

		if (partes.length == 3) {
			int dia = new Integer(partes[0]);
			int mes = new Integer(partes[1]);
			int ano = new Integer(partes[2]);

			if ((mes > 0) && (mes < 13)) {
				if (partes[2].length() == 4) {
					int diasRef = SR019.DIASDOMES[mes - 1];

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
