package Exercício_01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A Soma de " + a + " + " + b + " é = " + soma);
		sc.close();
		

	}

}
