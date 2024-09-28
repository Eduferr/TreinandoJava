package metodoInstancia_Exercicio;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Kit Revisão";
		produto.QuantidadeEstoque = 11	;

		System.out.println("É necessário repor o estoque do  produto " + '"' + produto.nome + "? "
				+ produto.necessitaDeReposicao());

	}

}
