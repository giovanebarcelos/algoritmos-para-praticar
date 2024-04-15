package repeticao;

/*
 * Fazer um algoritmo que calcule e escreva o valor de S:
 * S = 1/1 + 3/2 + 5/3 + 7/4 + … + 99/50
 * 
 * @author giovanebarcelos
 */

public class R057 {
	public static void main(String[] args) {
		float S = 0;

		System.out.print("S = ");
		for (int dividendo = 1, divisor = 1; divisor <= 50; divisor++, dividendo += 2) {
			System.out.printf("%d/%d", dividendo, divisor);

			if (divisor != 50) {
				System.out.print(" + ");
			} else {
				System.out.println("");
			}

			S += (dividendo / divisor);
		}

		System.out.printf("O valor de S é %.2f", S);
	}
}