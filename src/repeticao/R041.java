package repeticao;

import javax.swing.JOptionPane;

/*
 * Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada
 * a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário para
 * que essa massa se torne menor do que 0,5 grama. Escreva a massa inicial, a massa final e
 * o tempo calculado em horas, minutos e segundos.
 * 
 * @author giovanebarcelos
 */

public class R041 {
	private static final float MENORMASSA = 0.5f;
	private static final long SEGUNDOSPORHORA = 3600;
	private static final long SEGUNDOSPORMINUTO = 60;

	public static void main(String[] args) {
		double massaInicial = new Double(JOptionPane.showInputDialog("Massa Inicial em Gramas"));

		long segundos = 0;
		double massaFinal = massaInicial;
		while (massaFinal >= MENORMASSA) {
			segundos += 50;
			massaFinal /= 2;
		}

		long hh = segundos / SEGUNDOSPORHORA;
		segundos -= hh * SEGUNDOSPORHORA;
		long mm = segundos / SEGUNDOSPORMINUTO;

		String massaInicialStr = String.format("Massa Inicial: %.2f\n", massaInicial);
		String massaFinalStr = String.format("Massa Final: %.2f\n", massaFinal);
		String tempoGasto = String.format("Tempo Gasto: %d:%d:%d", hh, mm, segundos);

		JOptionPane.showMessageDialog(null, massaInicialStr + massaFinalStr + tempoGasto);
	}
}
