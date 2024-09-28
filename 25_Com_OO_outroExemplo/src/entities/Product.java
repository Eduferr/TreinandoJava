package entities;

public class Product {
	// Atributos do triangulo
	public String name;
	public double price;
	public int quantity;

	// Método ou funções ou operações

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Implementando um toString personalizado
	public String toString() {
		return name 
				+ ", $" 
				+ String.format("%.2f", price) //formatando a casa decimal em dois dígitos
				+ ", " 
				+ quantity 
				+ " units, Total: $" 
				+ String.format("%.2f", totalValueInStock());
	}

}
