package encapsulamento;

public class Encapsulamento {

	// Encapsulamento, é uma forma eficiente de proteger os dados manipulados
	// dentro da classe, além de determinar onde esta classe poderá ser manipulada.
	// Desta forma, as alterações ocorridas dentro da classe, serão refletidas onde
	// for necessário.

	public static void main(String[] args) {

//		Cliente cliente = new Cliente();
//		cliente.nome = "Eduardo Ferreira";
//		cliente.telefone = "61 9 8765-4321";
//
//		System.out.println("Nome Cliente: " + cliente.nome);

		Cliente cliente = new Cliente();
		cliente.setNome("Eduardo Ferreira");
		cliente.setTelefone("61 9 8765-4321");

		System.out.println("Nome cliente: " + cliente.getNome());
		
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Sobre nome: " + cliente.getSobreNome());
		System.out.println("Telefone: " + cliente.getTelefone());

	}

}
