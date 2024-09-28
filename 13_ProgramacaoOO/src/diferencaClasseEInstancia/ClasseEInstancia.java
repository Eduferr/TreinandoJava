package diferencaClasseEInstancia;

public class ClasseEInstancia {

	public static void main(String[] args) {
		// Uma variável estática pode ser acessada atráves da próprio classe ex:
		// "Produto."
		System.out.println("1 - Quantidade mínima estoque: " + Produto.quantidadeMinimaEstoque);

		Produto produto = new Produto();
		produto.nome = "Lápis";

		produto.quantidadeMinimaEstoque = 10; // Como também uma variável que é do tipo dessa classe.
												// Porém sobrescrevendo o dado anterior.

		Produto produto1 = new Produto();
		produto1.nome = "Borracha";

		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto1.nome);

	}
}
