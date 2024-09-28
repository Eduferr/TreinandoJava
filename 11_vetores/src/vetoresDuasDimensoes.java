
public class vetoresDuasDimensoes {

	public static void main(String[] args) {
		Double faturamentoDia = 1000.0;

		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFevereiro = new Double[] { 1000.0, 2500.0, 1800.0 };

		// Cada posição, dentro de um vetor de 2 dimensões, precisa ser um vetor de 1
		// dimensão
		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };

//		System.out.println("O valor do dia 1º de janeiro: R$" + faturamentoAnual[0][0]); //1ª posição do V2d - 2º posição do v1d
//		System.out.println("O valor do dia 3 de Fevereiro: R$" + faturamentoAnual[1][2]);

		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.err.println("Mês: " + (i + 1)); // i+1 para a impressão não apresentar o mês zero do vetor

//			Double[] mes = faturamentoAnual[i]; // variavel para percorrer o vetor de cada mês
			// este segundo for vai iterar pelo vetor mes
//			for (int y = 0; y < mes.length; y++) {
			for (int y = 0; y < faturamentoAnual[i].length; y++) {
//				Double dia = mes[y];
				// ou
				Double dia = faturamentoAnual[i][y];
				System.out.println("Dia " + (y + 1) + ": " + dia);// y+1 para a impressão não apresentar o mês zero do
																	// vetor

			}
		}

	}

}
