package decisao;

import javax.swing.JOptionPane;

/*
 * Ler um número inteiro de 4 casas e imprimir se é ou não, múltiplo de quatro o número
 * formado pelos algarismos que estão nas casas das unidades de milhar e da centenas .
 * 
 * @author giovanebarcelos
 */

public class C034 {
	public static void main(String[] args) {
		long numero = new Long(JOptionPane.showInputDialog("Número"));

		String numeroStr = new Long(numero).toString();

		if (numeroStr.length() > 3) {
			int numeroMilhar = new Integer(numeroStr.substring(numeroStr.length() - 4));
			int numeroCentena = new Integer(numeroStr.substring(numeroStr.length() - 3));

			String mensagem = "";
			if (numeroMilhar % 4 == 0) {
				mensagem = "Número milhar é divisível por 4.";
			}

			if (numeroCentena % 4 == 0) {
				mensagem += "Número da centena é divisível por 4.";
			}

			if (mensagem.length() == 0) {
				mensagem = "Milhar e centena não são divisíveis por 4.";
			}

			JOptionPane.showMessageDialog(null, mensagem);
		} else {
			JOptionPane.showMessageDialog(null, "Número não tem 4 algorismos!");
		}
	}
}
