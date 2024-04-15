package sequencial;

import javax.swing.JOptionPane;

/*
 * Sabendo que latão é constituído de 70% de cobre e 30% de zinco, indique a quantidade de
 * cada um desses componentes para se obter uma certa quantidade de latão (requerida pelo
 * usuário).
 * 
 * @author giovanebarcelos
 */

public class S043 {
	public static void main(String[] args) {
		int qtdeLatao = new Integer(JOptionPane.showInputDialog("Quantidade de Latão"));

		float qtdeCobre = qtdeLatao * 0.7f;
		float qtdeZinco = qtdeLatao * 0.3f;

		JOptionPane.showMessageDialog(null,
				String.format("Para obter %d de latão serão necessário %.2f de cobre e %.2f de zinco", qtdeLatao,
						qtdeCobre, qtdeZinco));
	}
}