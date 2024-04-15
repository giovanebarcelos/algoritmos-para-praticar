package decisao;

import javax.swing.JOptionPane;

/*
 * Entrar com o salário de uma pessoa e imprimir o desconto do INSS segundo a tabela
 * abaixo:
 * - menor ou igual a R$ 600,00 – isento ;
 * - maior que R$ 600,00 e menor ou igual a R$ 1200,00 – 20% ;
 * - maior que R$ 1200,00 e menor ou igual a R$2000,00 – 25% ;
 * - maior que R$ 2000,00 – 30% .
 * 
 * @author giovanebarcelos 
 */

public class C024 {
	public static void main(String[] args) {
		double salario = new Double(JOptionPane.showInputDialog("Salário"));

		double descontoINSS;
		if (salario <= 600) {
			descontoINSS = 0;
		} else if (salario <= 1200) {
			descontoINSS = salario * 0.2;
		} else if (salario <= 2000) {
			descontoINSS = salario * 0.25;
		} else {
			descontoINSS = salario * 0.3;
		}

		JOptionPane.showMessageDialog(null, "Desconto INSS = " + String.format("%.2f", descontoINSS));
	}
}