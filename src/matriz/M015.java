package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias
 * de um mês escolhido.
 * Calcular e escrever:
 * a) Menor temperatura do mês
 * b) Maior temperatura do mês
 * c) Temperatura média mensal
 * d) O número de dias no mês em que a temperatura foi inferior a média mensal
 *
 * @author giovanebarcelos
 */

public class M015 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual é o mês entre 1 e 12 que desejas ler a temperatura? ");
		int mes = ler.nextInt();
		System.out.print("Qual é o ano? ");
		int ano = ler.nextInt();

		int[] temperaturaMediaDoMes = M015.lerTemperaturaMediaDoMes(ano, mes);

		System.out.printf("\nMenor temperatura do mês é %d\n", M015.menorTemperaturaDoMes(temperaturaMediaDoMes));
		System.out.printf("Maior temperatura do mês é %d\n", M015.maiorTemperaturaDoMes(temperaturaMediaDoMes));
		System.out.printf("Temperatura média mensal é %d\n", M015.temperaturaMediaMensal(temperaturaMediaDoMes));
		System.out.printf("O número de dias no mês em que a temperatura foi inferior a média mensal: %d dias\n",
				M015.numeroDeDiasTemperaturaInferiorAMediaMensal(temperaturaMediaDoMes));

		ler.close();
	}

	private static Object numeroDeDiasTemperaturaInferiorAMediaMensal(int[] temperaturaMediaDoMes) {
		int contaDiasTemperaturaInferior = 0, mediaTemperaturaMes = M015.temperaturaMediaMensal(temperaturaMediaDoMes);

		for (int temperatura : temperaturaMediaDoMes) {
			if (temperatura < mediaTemperaturaMes) {
				contaDiasTemperaturaInferior++;
			}
		}

		return contaDiasTemperaturaInferior;
	}

	private static int temperaturaMediaMensal(int[] temperaturaMediaDoMes) {
		long somaTemperatura = 0;

		for (int temperatura : temperaturaMediaDoMes) {
			somaTemperatura += temperatura;
		}

		return (int) (somaTemperatura / temperaturaMediaDoMes.length);
	}

	private static int maiorTemperaturaDoMes(int[] temperaturaMediaDoMes) {
		int maiorTemperatura = temperaturaMediaDoMes[0];

		for (int temperatura : temperaturaMediaDoMes) {
			if (maiorTemperatura < temperatura) {
				maiorTemperatura = temperatura;
			}
		}

		return maiorTemperatura;
	}

	private static int menorTemperaturaDoMes(int[] temperaturaMediaDoMes) {
		int menorTemperatura = temperaturaMediaDoMes[0];

		for (int temperatura : temperaturaMediaDoMes) {
			if (menorTemperatura > temperatura) {
				menorTemperatura = temperatura;
			}
		}

		return menorTemperatura;
	}

	private static int[] lerTemperaturaMediaDoMes(int ano, int mes) {
		Scanner ler = new Scanner(System.in);

		int[] numeroDeDiasMesesDoAno = { 31, ((ano % 4) == 0 ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] temperaturaMediaDoMes = new int[numeroDeDiasMesesDoAno[mes - 1]];

		System.out.printf("\nDigitar as temperaturas do mês %d e ano %d:\n", mes, ano);

		for (int dia = 0; dia < temperaturaMediaDoMes.length; dia++) {
			System.out.print("Dia " + (dia + 1) + ":");
			temperaturaMediaDoMes[dia] = ler.nextInt();
		}

		ler.close();

		return temperaturaMediaDoMes;
	}
}