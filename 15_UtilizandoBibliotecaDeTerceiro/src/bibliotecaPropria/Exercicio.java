package bibliotecaPropria;

import console.Interacao;

//Sua tarefa agora é pegar a classe CalcularValorTroco do capítulo 2 e 
//utilizar a nossa biblioteca AlgaWorksConsole ao invés da classe Scanner diretamente.

public class Exercicio {

	public static void main(String[] args) {

		Interacao interacao = new Interacao();

		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");

		Double valorEntreguePeloCliente = interacao.lerDecimal("Digite o valor do produto: ");
		
		Double troco = valorEntreguePeloCliente - valorProduto;
		
		interacao.imprimir("O troco é: R$" +troco);
		
		interacao.fechar();

	}

}
