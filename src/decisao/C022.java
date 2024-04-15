package decisao;

import javax.swing.JOptionPane;

/*
 * Dados 3 valores referentes aos lados de um triângulo determinar se é EQUILÁTERO
 * (todos os lados são iguais), ISÓSCELES (dois lados iguais) ou ESCALENO (todos os
 * lados diferentes) . EQUILÁTERO → (A = B) E (B = C) ; ISÓSCELES → (A = B) OU (A
 * = C) OU (B = C) ; ESCALENO → (A <> B) E (B <> C)
 * 
 * @author giovanebarcelos
 */

public class C022 {
	public static void main(String[] args) {
		long ladoA = new Long(JOptionPane.showInputDialog("Lado A:"));
		long ladoB = new Long(JOptionPane.showInputDialog("Lado B:"));
		long ladoC = new Long(JOptionPane.showInputDialog("Lado C:"));

		String tipoTriangulo;
		if ((ladoA == ladoB) && (ladoB == ladoC)) {
			tipoTriangulo = "Equilátero";
		} else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
			tipoTriangulo = "Isósceles";
		} else {
			tipoTriangulo = "Escaleno";
		}

		JOptionPane.showMessageDialog(null, "Tipo de triângulo é " + tipoTriangulo);
	}
}