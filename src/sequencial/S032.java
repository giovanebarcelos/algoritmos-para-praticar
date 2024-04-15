package sequencial;

import javax.swing.JOptionPane;

/*
 * Fazer um algoritmo que mostre quantas horas, quantos minutos e quantos segundos
 * existem em um intervalo de horas que será lido pelo teclado.
 * 
 * @author giovanebarcelos
 */

public class S032 {
	private static final int MINUTOSPORHORA = 60;
	private static final int SEGUNDOSPORHORA = 3600;

	public static void main(String[] args) {
		long horaInicial = new Integer(JOptionPane.showInputDialog("Hora Inicial"));
		long horaFinal = new Integer(JOptionPane.showInputDialog("Hora Final"));

		long horasIntervalo = horaFinal - horaInicial;
		long minutosIntervalo = horasIntervalo * MINUTOSPORHORA;
		long segundosIntervalo = horasIntervalo * SEGUNDOSPORHORA;

		JOptionPane.showMessageDialog(null, horasIntervalo + " horas no intervalo; " + minutosIntervalo
				+ " minutos no intervalo; " + segundosIntervalo + " segundos no intervalo");
	}
}
