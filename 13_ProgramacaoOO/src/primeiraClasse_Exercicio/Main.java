package primeiraClasse_Exercicio;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Macarrão Cremoso";
		produto.quantidadeEstoque = 8;

		imprimir(produto);

	}

	static String eNecessarioReporEstoque(Produto produto) {
		if (produto.quantidadeEstoque < produto.QUANTIDADE_MINIMA_ESTOQUE) {
			String ReporEstoque = "Sim é necessário";
			return ReporEstoque;
		}
		String ReporEstoque = "Não é necessário";
		return ReporEstoque;
	}

	static void imprimir(Produto produto) {
		System.out.println("É necessário repor o estoque do  produto " + '"' + produto.nome + '"' + "? "
				+ eNecessarioReporEstoque(produto));

	}

}
