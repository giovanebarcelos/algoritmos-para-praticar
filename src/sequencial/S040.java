package sequencial;

import java.util.Scanner;

/*
 * Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
 * inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo
 * máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar
 * no dia seguinte.
 * 
 * @author giovanebarcelos
 */

public class S040 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Hora Inicio: ");
		int horaInicio = ler.nextInt();
		System.out.print("Hora Fim: ");
		int horaFim = ler.nextInt();

		int tempoJogo;
		if (horaFim < horaInicio) {
			tempoJogo = 24 - horaInicio + horaFim;
		} else {
			tempoJogo = horaFim - horaInicio;
		}

		System.out.printf("O tempo de jogo foi de %d horas", tempoJogo);

		ler.close();
	}
}