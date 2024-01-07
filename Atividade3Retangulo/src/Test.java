import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner scaner = new Scanner(System.in);
		
		double width = scaner.nextDouble();
		rectangle.setWidth(width);
		
		double height = scaner.nextDouble();
		rectangle.setHeight(height);
		
		System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());
		
		
		scaner.close();

	}

}
