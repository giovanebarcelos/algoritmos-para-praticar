package sequencial;

import java.util.Scanner;

/*
 * Dado um sistema de equações lineares e as fórmulas de resolução: 
 * ax + by = c
 * dx + ey = f
 * x = ( ce − bf ) / (ae − bd ) e
 * y = (af − cd ) / (ae − bd )
 * Elabore um programa para ler os coeficientes (a, b, c, d, e, f) e apresentar x e y.
 * 
 * @author giovanebarcelos  
 */

public class S009 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite os coeficientes");
		System.out.print("a:");
		float a = ler.nextFloat();
		System.out.print("b:");
		float b = ler.nextFloat();
		System.out.print("c:");
		float c = ler.nextFloat();
		System.out.print("d:");
		float d = ler.nextFloat();
		System.out.print("e:");
		float e = ler.nextFloat();
		System.out.print("f:");
		float f = ler.nextFloat();

		// Calculos
		float x = (c * e - b * f) / (a * e - b * d);
		float y = (a * f - c * d) / (a * e - b * d);

		System.out.printf("Os valores de x e y são %.2f e %.2f", x, y);

		ler.close();
	}
}
