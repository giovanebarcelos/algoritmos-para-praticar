package repeticao;

import java.util.Scanner;

/*
 * O dia da semana para uma data qualquer pode ser calculado pela seguinte fórmula:
 * Dia da semana = RESTO(QUOCIENTE(2,6 x M – 0,2, 1) + D + A + QUOCIENTE(A,4)
 * + QUOCIENTE(S,4) – 2 x S, 7)
 * Onde:
 * M – representa o número do mês. Janeiro e fevereiro são os meses 11 e 12 do ano
 * precedente, março é o mês 1 e dezembro é o mês 10;
 * D – representa o dia do mês;
 * A – representa o número formado pelos dois últimos algarismos do ano;
 * S – representa o número formado pelos dois primeiros algarismos do ano;
 * Os dias da semana são numerados de zero a seis; Domingo corresponde a 0, Segunda a 1,
 * e assim por diante/
 * Fazer um algoritmo que:
 * - leia um conjunto de 50 datas (dia, mês, ano);
 * - determine o dia da semana correspondente à data lida, segundo o método especificado;
 * - escreva, para cada data lida, o dia, mês, ano e o dia da semana calculado.
 * 
 * @author giovanebarcelos
 */

public class R054 {
	private static final int NRODEDIASPARALER = 1;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		for (int conta = 1; conta <= NRODEDIASPARALER; conta++) {
			System.out.print("Dia: ");
			int dia = ler.nextInt();
			System.out.print("Mês: ");
			int mes = ler.nextInt();
			System.out.print("Ano em 4 digitos (Ex: 2016): ");
			int ano = ler.nextInt();

			Integer anoAdj = mes < 3 ? ano - 1 : ano;
			int ss = new Integer(anoAdj.toString().substring(0, 2));
			int aa = new Integer(anoAdj.toString().substring(2));
			int m = mes > 2 ? mes - 2 : mes + 10;

			int diaDaSemana = Math.abs((new Integer((int) ((2.6 * m) - 0.2)).intValue() + dia + aa
					+ new Integer(aa / 4).intValue() + new Integer(ss / 4).intValue() - 2 * ss) % 7);

			String diaSemanaExtenso = "";
			switch (diaDaSemana) {
			case 0:
				diaSemanaExtenso = "Domingo";
				break;
			case 1:
				diaSemanaExtenso = "Segunda";
				break;
			case 2:
				diaSemanaExtenso = "Terça";
				break;
			case 3:
				diaSemanaExtenso = "Quarta";
				break;
			case 4:
				diaSemanaExtenso = "Quinta";
				break;
			case 5:
				diaSemanaExtenso = "Sexta";
				break;
			case 6:
				diaSemanaExtenso = "Sábado";
				break;
			}

			System.out.printf("O dia %d/%d/%d é %s\n", dia, mes, ano, diaSemanaExtenso);
		}

		ler.close();
	}
}