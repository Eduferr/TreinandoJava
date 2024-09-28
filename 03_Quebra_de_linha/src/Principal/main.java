package Principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt(); // Dessa forma gera um erro: pois a quebra de linha pendente será consumido em S1
		sc.nextLine(); // Comando extra para consumir a quebra de linha gerada na linha 14 por X
		s1 = sc.nextLine(); //ler o texto até a quebra de linha
		s2 = sc.nextLine(); //ler o texto até a quebra de linha
		s3 = sc.nextLine(); //ler o texto até a quebra de linha 

		System.out.println("Dados Digitados");
		System.out.println("x = " + x);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		sc.close(); //fechar o fluxo e liberar os recursos que estavam ocupados no fluxo

	}

}
