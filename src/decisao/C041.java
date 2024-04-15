package decisao;

import java.util.Scanner;

/*
 * Escreva um programa em Java que calcule o Valor a Pagar pela conta de energia elétrica para
 * uma determinada Classe Consumidora. Veja as informações a seguir:
 * a) O programa deve receber como dados de entrada: o tipo da Classe Consumidora,
 * (conforme definido na tabela 1) e o Consumo em quilowatts/hora (Kwh);
 * b) O cálculo do Valor do Fornecimento (VF), em Reais (R$), é definido pela seguinte
 * fórmula: VF = Consumo x Tarifa, onde a tarifa é definida na tabela 1, conforme a
 * classe consumidora.
 * c) O Valor a Pagar (VP) é definido pela seguinte fórmula: VP = VF + ICMS, onde a
 * taxa de ICMS é calculada aplicando uma alíquota de 30% ao valor do
 * fornecimento (ICMS = 0.3 x VF).
 * 
 * Classe Consumidora  Tarifa (R$)
 * A                    0,5
 * B                    0,8
 * C                    1,5
 * 
 * @author giovanebarcelos
 */

public class C041 {
	private static final float ALIQUOTAICMS = 0.3f;

	public static void main(String[] args) {
		System.out.println("Tabela das Categorias de Consumo");
		System.out.println("Classe Consumidora  Tarifa (R$)");
		System.out.println("A                    0,5");
		System.out.println("B                    0,8");
		System.out.println("C                    1,5");

		Scanner ler = new Scanner(System.in);

		System.out.print("Tipo de Classe Consumidora: ");
		String tipoClasse = ler.next();

		System.out.print("Consumo em quilowatts/hora (Kwh): ");
		float consumoKwh = ler.nextFloat();

		float tarifa;
		if ("A".equals(tipoClasse)) {
			tarifa = 0.5f;
		} else if ("B".equals(tipoClasse)) {
			tarifa = 0.8f;
		} else {
			tarifa = 1.5f;
		}

		double valorFornecimento = consumoKwh * tarifa;
		double valorAPagar = valorFornecimento * (1 + ALIQUOTAICMS);

		System.out.printf("Valor a Pagar = %.2f", valorAPagar);

		ler.close();
	}
}
