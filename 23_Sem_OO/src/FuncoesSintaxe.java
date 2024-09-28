import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int numeroMaior = max(a, b, c); //uma função personalizada
		showResult(numeroMaior); // uma função personalizada
		sc.close();
	}
	//criando a função max (retorna tipo inteiro)
	public static int max(int n1, int n2, int n3) {
		int aux; //variável local auxiliar
		if (n1 > n2 && n1 > n3) {
			aux = n1;
		} else if (n2 > n3) {
			aux = n2;
		} else {
			aux = n3;
		}
		return aux;
	}
	
	//criando a função de impressão
	public static void showResult(int value) {
		System.out.println("O maior número é: " + value);

	}

}
