package primeiraClasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto(); //Um tipo de scanner 
		produto.nome = "Smartphone";
		produto.preco = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);

	}
	static void exibirQuantidadeEmEstoque(Produto produto) {
	System.out.println("A quantidade em estoque do produto " + '"'+produto.nome +'"'+ " é de " + produto.quantidade + " unidades");	
	}

}
