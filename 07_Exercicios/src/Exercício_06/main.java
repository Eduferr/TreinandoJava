package Exercício_06;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, tri, cir, trap, qua, ret, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		

		tri = a * c / 2.0;
		cir = pi * Math.pow(c,2);
		trap = (a + b) / 2.0 * c;
		qua = b * b;
		ret = a * b;
		
		
		System.out.printf("Triangulo: %.3f%n", tri);
		System.out.printf("Circulo: %.3f%n", cir);
		System.out.printf("Trapezio: %.3f%n", trap);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retangulo: %.3f%n", ret);
		sc.close();
		
		

	}

}
