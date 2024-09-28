package Exercício_02;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US); //altera de , para .
		
		double raio, area, pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2); // Math.pow - elevado ao quadrado
		
		System.out.printf("A área é = %.4f%n", area);
		sc.close();
		
		

	}

}
