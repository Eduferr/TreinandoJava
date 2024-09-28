package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Métodos estático não precisam ser instanciado
		// Calculator calc = new Calculator();

		System.out.print("Enter Radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius); //metodo estático
		double v = Calculator.volume(radius); //metodo estático

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

}
