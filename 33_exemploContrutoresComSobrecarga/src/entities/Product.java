package entities;

public class Product {

	public String name;  //atributo do objeto
	public double price; //atributo do objeto
	public int quantity; //atributo do objeto
	
	public Product() {
		//construtor padrão
	}

	public Product (String name, double price, int quantity) { // método construtor this
		this.name = name; //this referencia o atributo do objeto
		this.price = price;
		this.quantity = quantity;
	}
	//Sobrecarga é disponibilizar mais de uma versão da mesma operação
	//Com lista de parametros diferentes
	
	public Product (String name, double price) { // método construtor Sobrecarga
		this.name = name; 
		this.price = price;
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
