package metodoInstancia;

public class Cliente {
	// Abstraindo as propriedades de um cliente
	// Variáveis de instância
	String primeiroNome;
	String sobreNome;
	String telefone;
	String email;

	//Metodo de instância (sem static)
	String obterNomeCompleto() {
		//variável local utilizada somente por este método
		String nomeCompleto = primeiroNome + " " + sobreNome;
		return nomeCompleto;
	}
	
//	static String obterNomeCompleto(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.sobreNome;
//		return nomeCompleto;
//	}
	
	String obterDDD() {
		String ddd = telefone.substring(0,2); 
		return ddd;
	}

}
