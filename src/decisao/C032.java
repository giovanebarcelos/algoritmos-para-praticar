package decisao;

import java.util.Scanner;

/*
 * Desenvolva um algoritmo que a partir da idade e peso do paciente calcule a dosagem de
 * determinado medicamento e imprima a receita informando quantas gotas do medicamento
 * o paciente deve tomar por dose. Considere que o medicamento em questão possui 500 mg
 * por ml, e que cada ml corresponde a 20 gotas.
 * - Adultos ou adolescentes desde 12 anos, inclusive, se possuírem peso igual ou acima de
 * 60 quilos devem tomar 1000 mg , com peso abaixo de 60 quilos devem tomar 875 mg.
 * - Para crianças e adolescentes abaixo de 12 anos a dosagem á calculada pelo peso
 * corpóreo conforme tabela abaixo:
 * 5 kg até 9 kg = 125 mg
 * acima de 9 kg até 16 kg = 250 mg
 * acima de 16 kg até 24 kg = 375 mg
 * acima de 24 kg até 30 kg = 500 mg
 * acima de 30 kg = 750 mg
 * 
 * @author giovanebarcelos
 */

public class C032 {
	private static final int GOTASPORML = 20;
	private static final int MGPORML = 500;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = ler.nextInt();

		System.out.print("Peso: ");
		float peso = ler.nextFloat();

		int dosagem = 0;
		if (idade >= 12) {
			dosagem = peso >= 60 ? 1000 : 875;
		} else {
			if (peso >= 6 && peso <= 9) {
				dosagem = 125;
			} else if (peso > 9 && peso <= 16) {
				dosagem = 250;
			} else if (peso > 16 && peso <= 24) {
				dosagem = 375;
			} else if (peso > 24 && peso <= 30) {
				dosagem = 500;
			} else if (peso > 30) {
				dosagem = 750;
			}
		}

		int gotas = ((dosagem / MGPORML) * GOTASPORML);

		System.out.printf("O paciente deve tomar %d mg equivalentes a %d gotas", dosagem, gotas);

		ler.close();
	}
}
