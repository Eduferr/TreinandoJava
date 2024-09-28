package entities;

public class Product {

	public String name;  //atributo do objeto
	public double price; //atributo do objeto
	public int quantity; //atributo do objeto
	
	public Product (String name, double price, int quantity) { // método construtor
		this.name = name; //this referencia o atributo do objeto
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
