package decisao;

import javax.swing.JOptionPane;

/*
 * Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendose
 * que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5%
 * sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
 * 
 * @author giovanebarcelos
 */

public class C046 {
	private static final double LIMITECOMISSAOTRESPORCENTO = 1500f;
	private static final float TRESPORCENTO = 0.03f;
	private static final double CINCOPORCENTO = 0.05f;

	public static void main(String[] args) {
		double salario = new Double(JOptionPane.showInputDialog("Salário"));
		double receitaVendas = new Double(JOptionPane.showInputDialog("Receita Vendas"));

		double comissao = 0;

		if (receitaVendas > LIMITECOMISSAOTRESPORCENTO) {
			comissao = (LIMITECOMISSAOTRESPORCENTO * TRESPORCENTO)
					+ ((receitaVendas - LIMITECOMISSAOTRESPORCENTO) * CINCOPORCENTO);
		} else {
			comissao = receitaVendas * TRESPORCENTO;
		}

		double salarioTotal = salario + comissao;

		JOptionPane.showMessageDialog(null,
				String.format("Salário total igual a %.2f sendo %.2f de salário e %.2f de comissão", salarioTotal,
						salario, comissao));
	}
}
