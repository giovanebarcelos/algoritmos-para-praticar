package repeticao;

/*
 * Escreva um algoritmo para imprimir os 7 primeiros números inteiros maiores que 50.
 * 
 * @author giovanebarcelos
 */

public class R025 {
	public static void main(String[] args) {
		int numero = 7, numeroInicial = 50;
		while (numero > 0) {
			numeroInicial++;
			System.out.println(numeroInicial);
			numero--;
		}
	}
}