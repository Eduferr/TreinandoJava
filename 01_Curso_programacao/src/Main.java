

import java.util.Locale;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		System.out.println(); // Imprime com quebra de linha
		System.out.printf("%.2f%n", x); // imprime com formato de 2 casas depois da vírgula
		System.out.printf("%.4f%n%n", x); // imprime com formato de 4 casas depois da vírgula

		Locale.setDefault(Locale.US); // Define a liguagem local
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		
		System.out.printf("Resultado = %.2f metros%n", x); // imprime com formata��o de casas decimais
		
		String nome = "Eduardo";
		int idade = 18;
		double renda = 2000;
		
		// %s -> para o String  // %d -> valor inteiro  // %.2f -> valor real  // %c -> valor de Char
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
		
		
		


	}

}
