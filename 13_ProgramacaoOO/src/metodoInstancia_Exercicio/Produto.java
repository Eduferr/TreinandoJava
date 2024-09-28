package metodoInstancia_Exercicio;

public class Produto {

	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

	String nome;
	Integer QuantidadeEstoque;

	String necessitaDeReposicao() {
		if(QuantidadeEstoque < QUANTIDADE_MINIMA_ESTOQUE) {
			return "Repor o estoque";
		}
		return "Não precisa repor o estoque";

//	Boolean eNecessarioReporEstoque() {
//		if (quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
//			return true;
//		}
//
//		return false;

	}

}
