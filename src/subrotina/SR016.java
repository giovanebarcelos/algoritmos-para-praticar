package subrotina;

import java.util.Scanner;

/*
 * Escreva uma função que determine o número de segundos decorridos entre dois instantes.
 * Cada instante é dado como três valores inteiros válidos correspondentes a hora (0...23),
 * minuto (0...59) e segundo (0 ... 59). Escreva um programa que leia dois valores válidos de
 * instantes, fornecendo-os a esta função para que se determine o número de segundos
 * entre tais instantes.
 *
 * @author giovanebarcelos
 */

public class SR016 {
	private static final int SEGUNDOSPORMINUTO = 60;
	private static final int SEGUNDOSPORHORA = 3600;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Instante 1: ");
		System.out.print("Hora 1: ");
		int hora1 = ler.nextInt();
		System.out.print("Minuto 1: ");
		int minuto1 = ler.nextInt();
		System.out.print("Segundo 1: ");
		int segundo1 = ler.nextInt();

		System.out.println("Instante 2: ");
		System.out.print("Hora 2: ");
		int hora2 = ler.nextInt();
		System.out.print("Minuto 2: ");
		int minuto2 = ler.nextInt();
		System.out.print("Segundo 2: ");
		int segundo2 = ler.nextInt();

		long tempoDecorrido = SR016.tempoDecorridoEmSegundos(hora1, minuto1, segundo1, hora2, minuto2, segundo2);

		System.out.printf("\nO tempo decorrido em segundos entre o instante 1 e 2 é %d segundos!\n", tempoDecorrido);

		ler.close();
	}

	private static long tempoDecorridoEmSegundos(int hora1, int minuto1, int segundo1, int hora2, int minuto2,
			int segundo2) {
		long tempoInstante1 = SR016.tempoEmSegundos(hora1, minuto1, segundo1),
				tempoInstante2 = SR016.tempoEmSegundos(hora2, minuto2, segundo2);

		return tempoInstante2 - tempoInstante1;
	}

	private static long tempoEmSegundos(int hora, int minuto, int segundo) {
		return (hora * SR016.SEGUNDOSPORHORA) + (minuto * SR016.SEGUNDOSPORMINUTO) + segundo;
	}
}