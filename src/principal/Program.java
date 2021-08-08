package principal;

import java.util.Locale;
import java.util.Scanner;
import util.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", Math.sqrt(rectangle.diagonal()));
		
		sc.close();

	}

}