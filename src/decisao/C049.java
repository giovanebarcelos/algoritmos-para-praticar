package decisao;

import javax.swing.JOptionPane;

/*
 * Ler um valor e escrever se é positivo, negativo ou zero.
 * 
 * @author giovanebarcelos
 */

public class C049 {
	public static void main(String[] args) {
		double valor = new Double(JOptionPane.showInputDialog("Valor"));

		String mensagem;
		if (valor == 0) {
			mensagem = "Valor zero!";
		} else if (valor > 0) {
			mensagem = "Valor positivo!";
		} else {
			mensagem = "Valor negativo!";
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
