package util;

public class Rectangle {
	
	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return width * 2 + 2 * height;
	}
	
	public double diagonal() {
		return width * width + height * height;
	}
}
