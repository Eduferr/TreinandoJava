package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		// Adiconando quantidade ao estoque
		System.out.print("Enter the number of products to be added in stock: ");
		int addQuantity = sc.nextInt();
		product.addProducts(addQuantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		// removendo quantidade do estoque
		System.out.print("Enter the number of products to be removed from stock: ");
		int removedQuantity = sc.nextInt();
		product.removeProducts(removedQuantity);
		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}

}
