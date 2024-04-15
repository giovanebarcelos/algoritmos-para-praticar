package repeticao;

import java.util.Scanner;

/*
 * Os bancos atualizam diariamente as contas de seus clientes. Essa atualização envolve a
 * análise dos depósitos e retiradas de cada conta. Numa conta de balanço mínimo, uma taxa
 *  * de serviço é deduzida se a conta cai abaixo de uma certa quantia especificada. Suponha
 *  que uma conta particular comece o dia com um balanço de R$ 60,00. O balanço mínimo
 *  exigido é R$ 30,00 e se o balanço de fim de dia for menor do que isso, uma taxa é
 *  reduzida da conta. A fim de que essa atualização fosse feita utilizando computador, é
 *  fornecido o seguinte conjunto de dados:
 *  - a primeira linha contém o valor do balanço mínimo diário, quantidade de transações e
 *  taxa de serviço;
 *  - as linhas seguintes contém número da conta, valor da transação e código da transação
 *  (depósito ou retirada);
 *  Escrever um algoritmo que:
 *  - calcule o balanço (saldo/débito) da conta ao fim do dia (se o resultado for negativo, isto
 *  significa insuficiência de fundos na conta);
 *  - escreva, para cada conta, o seu número e o balanço calculado. Se não houver fundos,
 *  imprima o número da conta e a mensagem “NÃO HÁ FUNDOS”.
 *  
 *  @author giovanebarcelos
 */

public class R050 {
	private static final double VALORMINIMOEXIGIDO = 30f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número da Conta: ");
		String nroConta = ler.nextLine();
		System.out.print("Saldo da Conta: ");
		double saldoDaConta = ler.nextDouble();
		System.out.print("Quantidade Transações: ");
		int qtdeTransacoes = ler.nextInt();
		System.out.print("Taxa de Serviço: ");
		float taxaDeServico = ler.nextFloat();

		while (qtdeTransacoes > 0) {
			System.out.print("Tipo de Transação - (D)epósito ou (R)etirada: ");
			String tipoDeTransacao = ler.next();
			System.out.print("Valor da Transação: ");
			double valorDaTransacao = ler.nextDouble();

			if ("D".equalsIgnoreCase(tipoDeTransacao)) {
				saldoDaConta += valorDaTransacao;
			} else {
				saldoDaConta -= valorDaTransacao;
			}

			qtdeTransacoes--;
		}

		if (saldoDaConta < VALORMINIMOEXIGIDO) {
			saldoDaConta -= taxaDeServico;
		}

		System.out.printf("\nConta %s possui saldo igual a %.2f\n", nroConta, saldoDaConta);

		if (saldoDaConta < 0) {
			System.out.println("NÃO HÁ FUNDOS!");
		}

		ler.close();
	}
}