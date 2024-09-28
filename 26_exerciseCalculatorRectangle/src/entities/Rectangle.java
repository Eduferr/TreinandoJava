package entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width + width) * 2;
	}

	public double diagonal() {
		// return Math.sqrt(Math.pow(width, 2.0) + Math.pow(width, 2.0));
		return Math.sqrt((width * width) + (height * height));
	}

}
