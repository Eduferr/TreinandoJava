package encapsulamento;

public class Cliente {

	// String nome;
	String primeiroNome;
	String sobreNome;
	String telefone;

	String getNome() {
		return primeiroNome + " " + sobreNome;
	}

	// Colocar um valor na variável de instância
	void setNome(String nome) {
		// split separa a string em duas partes, formando um vetor
		String[] nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		sobreNome = nomeCompleto[1];
	}

	String getPrimeiroNome() {
		return primeiroNome;
	}

	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	String getSobreNome() {
		return sobreNome;
	}

	void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	String getTelefone() {
		return telefone;
	}

	void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
