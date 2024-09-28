package Exercício_05;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, quant1, cod2, quant2;
		double vl1, vl2, vlTotal;

		// dados da peça 1
		System.out.println("Dados da primeira peça");
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		vl1 = sc.nextDouble();
		System.out.println("----------------");
		//dados da peça 2
		System.out.println("Dados da segunda peça");
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		vl2 = sc.nextDouble();		
		System.out.println("----------------");
		
		vlTotal = (quant1 * vl1) + (quant2 * vl2);
		
		System.out.printf("o valor total da compra é: R$ %.2f%n", vlTotal);

		sc.close();
		
	}

}
