package subrotina;

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo que calcule o enésimo termo da série de Fibonacci utilizando
 * função recursiva. A série de Fibonacci é uma sequência definida pela fórmula abaixo:
 * F(n) = 0, se n = 0
 * F(n) = 1, se n = 1
 * F(n) = F(n-1) + F(n-2), para os demais valores de N
 * Exemplo: para n = 10, exibir 55
 * F(0) F(1) F(2) F(3) F(4) F(5) F(6) F(7) F(8) F(9) F(10)
 * 0    1    1    2    3    5    8    13   21   34   55
 */

public class SR013 {
	public static void main(String[] args) {
		long posicaoFibo = new Integer(JOptionPane.showInputDialog("Posição do Termo Fibonacci"));

		JOptionPane.showMessageDialog(null,
				String.format("O termo fibonacci na posição %d é %d", posicaoFibo, SR013.fibonacci(posicaoFibo)));

	}

	public static long fibonacci(long n) {
		if (n < 2) {
			return n;
		} else {
			return SR013.fibonacci(n - 1) + SR013.fibonacci(n - 2);
		}
	}
}
