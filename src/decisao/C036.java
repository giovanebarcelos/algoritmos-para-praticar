package decisao;

import javax.swing.JOptionPane;

/*
 * Elabore um programa que leia o salário de um funcionário e, de acordo com a faixa
 * salarial em que ele se encontra, calcule e mostre o novo salário. As regras são:
 * a) Funcionários com salário inferior a R$ 800,00, reajuste de 7,5%;
 * b) Funcionários com salário entre R$ 800,00 e R$ 1.600,00, reajuste de 6,5%;
 * c) Funcionários com salário superior a R$ 1.600,00, reajuste de 3,7%.
 * 
 * @author giovanebarcelos
 */

public class C036 {
	public static void main(String[] args) {
		double salario = new Double(JOptionPane.showInputDialog("Salário"));

		float reajuste;
		if (salario < 800) {
			reajuste = 1.075f;
		} else if (salario < 1600) {
			reajuste = 1.065f;
		} else {
			reajuste = 1.037f;
		}

		double salarioComReajuste = salario * reajuste;

		JOptionPane.showMessageDialog(null, "O novo salário é " + String.format("%.2f", salarioComReajuste));
	}
}
