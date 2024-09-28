package entities;

public class Product {

	private String name; // atributo do objeto
	private double price; // atributo do objeto
	private int quantity; // atributo do objeto

	// Início - Métodos Construtores
	public Product() {
		// construtor padrão
	}

	public Product(String name, double price, int quantity) { // método construtor this
		this.name = name; // this referencia o atributo do objeto
		this.price = price;
		this.quantity = quantity;
	}
	// Sobrecarga é disponibilizar mais de uma versão da mesma operação
	// Com lista de parametros diferentes

	public Product(String name, double price) { // método construtor Sobrecarga
		this.name = name;
		this.price = price;
	}
	// Fim - Métodos Construtores
	
	
	// Início - get/set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void SetPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	// o quantity não terá um SET para proteger o objeto de alterações inconsistentes. 
	// Fim - get/set

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { // convertendo o objeto para string
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
