package entities;

public class Triangle {
	// Atributos do triangulo
	public double a;
	public double b;
	public double c;

	// Método
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	};

}
