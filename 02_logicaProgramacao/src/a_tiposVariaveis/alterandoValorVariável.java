package a_tiposVariaveis;
import java.util.Scanner;

public class alterandoValorVariável {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		Double valorProduto = sc.nextDouble();
		System.out.print("Digite o tipo de pagamento [1 = à vista / 2 = a prazo]: ");
		Integer tipoPagamento = sc.nextInt();

		Boolean pagamentoAVista = tipoPagamento.equals(1); // equals = é igual há

		Double juros = 0.0;
		if (!pagamentoAVista) { // Condição IF para o juros | o '!' nega a variável booleana
			juros = 10.0;
			}
		Double acrescimo = valorProduto * juros / 100;
		Double valorTotal = acrescimo + valorProduto;
		System.out.println("---------------------");
		System.out.println("Valor total: " + valorTotal);

		sc.close();

	}

}
