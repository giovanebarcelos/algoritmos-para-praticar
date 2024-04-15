package repeticao;

/*
 * Escreva um algoritmo que imprima as seguintes seqüências de números: (1, 1 2 3 4 5 6 7 8
 * 9 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10) e assim
 * sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 10.
 * 
 * @author giovanebarcelos
 */

public class R036 {
	public static void main(String[] args) {
		for (int primeiro = 1; primeiro <= 10; primeiro++) {
			System.out.printf("(%d, ", primeiro);
			for (int segundo = 1; segundo <= 10; segundo++) {
				System.out.printf("%d ", segundo);
			}
			System.out.print(")\n");
		}
	}
}