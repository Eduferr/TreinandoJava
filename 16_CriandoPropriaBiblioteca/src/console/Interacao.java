package console;

import java.util.Scanner;

public class Interacao {
	// usado no projeto 15_utilizando biblioteca de terceiros
	Scanner sc = new Scanner(System.in);

	public Integer lerNumero(String texto) {
		System.out.print(texto);
		return sc.nextInt();
	}

	public Double lerDecimal(String texto) {
		System.out.print(texto);
		return sc.nextDouble();
	}

	public String lerLinha(String texto) {
		System.out.print(texto);
		return sc.nextLine();
	}

	public void fechar() {
		sc.close();
	}

	public void imprimir(String texto) {
		System.out.println(texto);
	}

	public void erro(String texto) {
		System.err.println(texto);
	}

}
