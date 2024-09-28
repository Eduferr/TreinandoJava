import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char respetir;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();

			double f = 9.0 * c / 5.0 + 32;

			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);

			System.out.print("Deseja repetir (s/n)? ");
			respetir = sc.next().charAt(0);

		} while (respetir != 'n');

		sc.close();

	}

}
