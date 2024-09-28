package bibliotecaPropria;

import console.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um numero: ");
		interacao.imprimir("Numero: " + numero);
		
		Double decimal =  interacao.lerDecimal("Digite um decimal: "); //informe com vírgula
		interacao.imprimir("Numero: " + decimal);
		
		interacao.fechar();

	}

}
