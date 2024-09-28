package a_tiposVariaveis;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = sc.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantProduto = sc.nextInt();
		
		Double valorSubtotal = quantProduto * valorProduto;
		
		Boolean quantidadeMaiorOuIgualDez = quantProduto >= 10; //Poderia eliminar esta linha e fazer a condição direto no IF
		
		Double txDesconto = 0.0;
		
		if(quantidadeMaiorOuIgualDez) {
			txDesconto = 10.0;						
		}
		
		Double desconto = valorSubtotal * txDesconto / 100;
		Double valorComDesconto = valorSubtotal - desconto;
		
		System.out.println("------------------------");
		System.out.println("O valor total é: " + valorComDesconto);

		
	}

}
