package sequencial;

import java.util.Scanner;

/*
 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
 * trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com
 * um acréscimo de 50%.
 * Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por
 * hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras,
 * caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 * 
 * @author giovanebarcelos
 */

public class S041 {
	private static final int QTDESEMANASMES = 4;
	private static final int HORASSEMANAIS = 40;
	private static final float HORASEXTRAS = 0.5f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Horas trabalhadas no mês: ");
		float horasTrabalhadas = ler.nextFloat();
		System.out.print("Salário Hora: ");
		double salarioPorHora = ler.nextDouble();

		double salarioRegular = horasTrabalhadas * salarioPorHora;

		float horasExtras = horasTrabalhadas - (HORASSEMANAIS * QTDESEMANASMES);
		double valorHorasExtras = 0f;
		double salarioTotal = 0f;

		if (horasExtras > 0) {
			valorHorasExtras = horasExtras * salarioPorHora * HORASEXTRAS;
			salarioTotal = salarioRegular + valorHorasExtras;
		}

		System.out.printf(
				"Deve-se pagar %.2f de salário regular mais %.2f de horas extras " + "gerando um salário total de %.2f",
				salarioRegular, valorHorasExtras, salarioTotal);

		ler.close();
	}
}