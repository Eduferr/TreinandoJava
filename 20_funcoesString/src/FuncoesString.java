import java.util.Scanner;

public class FuncoesString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mask = 0b100000; //mascara
		int n = sc.nextInt();
		if ((n & mask) != 0) {
		System.out.println("6th bit é verdadeiro!");
		}
		else {
		System.out.println("6th bit é falso");
		}
		sc.close();

	}

}
