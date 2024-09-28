package metodoInstancia;

public class MetodoInstancia {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Eduardo";
		cliente.sobreNome = "Ferreira Gonçalves";
		cliente.telefone = "61 9 8765-4321";
		cliente.email = "eded@gmail.com";

		System.out.println("Nome do cliente é: " + cliente.obterNomeCompleto() + ", DDD: " +cliente.obterDDD());
		//System.out.println("Nome do cliente é: " + Cliente.obterNomeCompleto(cliente)); // Esse é um método estático

	}
	
}
