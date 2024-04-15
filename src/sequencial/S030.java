package sequencial;

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo para ler um valor inteiro em segundos, e depois converter e mostrá-lo
 * no formato hh:mm:ss.
 * 
 * @author giovanebarcelos
 */

public class S030 {
	private static final int SEGUNDOSPORHORA = 3600;
	private static final int SEGUNDOSPORMINUTO = 60;

	public static void main(String[] args) {
		long tempoEmSegundos = new Long(JOptionPane.showInputDialog("Tempo em Segundos"));

		int hh = (int) (tempoEmSegundos / SEGUNDOSPORHORA);
		int segundosRestantes = (int) (tempoEmSegundos - (hh * SEGUNDOSPORHORA));

		int mm = segundosRestantes / SEGUNDOSPORMINUTO;
		int ss = segundosRestantes - (mm * SEGUNDOSPORMINUTO);

		JOptionPane.showMessageDialog(null,
				tempoEmSegundos + " segundos são equivalentes a " + hh + ":" + mm + ":" + ss);

	}
}
