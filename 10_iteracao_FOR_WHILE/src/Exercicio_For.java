
public class Exercicio_For {

//	Dada a lista de números abaixo:
//	Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//	Itere por essa lista e imprima todos os números que são divisíveis por 3.
//	Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo. 
//	Toda vez que o módulo de um número por 3 for igual a zero, 
//	então esse número e divisível por 3.

	static final Integer DIVISOR = 3; //Valor estático

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i = 0; i < numeros.length; i++) {
			Integer numero = numeros[i]; // Capturar o número pela posição do array
			Integer moduloPorTres = numero % DIVISOR; // calculando o módulo ou resto para igual a zero

			if (moduloPorTres.equals(0)) {
				System.out.println("O número " + numero + " é divisível por 3.");

			}
		}
		System.out.println("Fim.");

	}

}
