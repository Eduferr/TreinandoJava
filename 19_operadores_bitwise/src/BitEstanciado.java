import java.util.Scanner;

public class BitEstanciado {

	public static void main(String[] args) {

		String original = " abcde FGHIJ ABC abc DEFG  ";

		String tudoMinusculo = original.toLowerCase();
		String tudoMaiusculo = original.toUpperCase();
		String removeEspacoLateral = original.trim();
		String aPartirDaReferencia = original.substring(3);
		String aPartirDeAteOLimite = original.substring(3, 10); // recorta a partir da posição 2 até abaixo da posição
																// 10
		String substituirCaracter = original.replace("H", "_");
		String substituirTrecho = original.replace("EF", "02");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original:                     (" + original + ")");
		System.out.println("Tudo minúsculo:               (" + tudoMinusculo + ")");
		System.out.println("Tudo maiúsculo:               (" + tudoMaiusculo + ")");
		System.out.println("Removendo espaço lateral:     (" + removeEspacoLateral + ")");
		System.out.println("Pegar a partir da posição:    (" + aPartirDaReferencia + ")");
		System.out.println("Pegar entre um intervalo:     (" + aPartirDeAteOLimite + ")");
		System.out.println("Substituir Caracter:          (" + substituirCaracter + ")");
		System.out.println("Substituir trecho:            (" + substituirTrecho + ")");
		System.out.println("1ª ocorrência do substring:   (posição " + i + ")");
		System.out.println("Ultima ocorrência:            (posição " + j + ")");

		System.out.println("--------------------------------------------");

		// ***************************
		// Separando a lista
		String nome = "Carro Cavalo Carroça";
		String[] vect = nome.split(" "); // passando para vetor e recortando a string com base em um separador
		String palavra1 = vect[0];
		String palavra2 = vect[1];
		String palavra3 = vect[2];

		System.out.println("Lista Completa: " + nome);
		System.out.println("1º nome: " + palavra1);
		System.out.println("2º nome: " + palavra2);
		System.out.println("3º nome: " + palavra3);

	}

}
