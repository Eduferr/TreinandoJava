import java.util.Scanner;

public class vetoresUmaDimensao {
// Vetor armazena mais de um valor
	
	public static void main(String[] args) {
//		String[] sabores = new String[] { "calabresa", "Atum", "queijo", "presunto" };
//
//		System.out.println("Escolha o sabor");
//
//		for (int i = 0; i < sabores.length; i++) {
//			System.out.println("[" + i + "] - " + sabores[i]);
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Digito o numero do sabor: ");
//		Integer saborEscolhido = sc.nextInt();
//		
//		System.out.println("Você escolheu o sabor: " + sabores[saborEscolhido]);		
//		sc.close();

//		String[] sabores = new String[] { "calabresa", "Atum", "queijo", "presunto" };		
//		sabores[3] = "frango"; // alterando informação do campo
//				for (int i = 0; i < sabores.length; i++) {
//			System.out.println("[" + i + "] - " + sabores[i]);
//		}

		
		String[] sabores = new String[4]; // Posso criar uma variável vetor sem o dados, mas é necessário informar o
	  									  // tamanho do vetor
		sabores[0] = "calabresa";
		sabores[1] = "Atum";
		sabores[2] = "queijo";
		sabores[3] = "presunto";

		for (int i = 0; i < sabores.length; i++) {
			System.out.println("[" + i + "] - " + sabores[i]);

		}
	}

}
