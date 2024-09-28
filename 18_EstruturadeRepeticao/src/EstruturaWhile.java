import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 2;
		int y = 10;
		while (x < y) {
			System.out.println(x + " - " + y);

			x = x * 2;
			y = y + 1;

		}

	}

}
