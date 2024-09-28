package Exercício_04;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		int nFunc;
		double htrabalho, vlHora, vlPago;
		
		Scanner sc = new Scanner(System.in);
		
		nFunc = sc.nextInt();
		htrabalho = sc.nextDouble();
		vlHora = sc.nextDouble();
		
		vlPago = htrabalho * vlHora;
		
		System.out.println("O número do funcionário é: " + nFunc);
		System.out.printf("O valor total pago é de: U$ %.2f%n", vlPago);
		
		sc.close();
		

	}

}
