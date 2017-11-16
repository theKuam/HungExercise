import java.util.Scanner;

public class Main {
	//Assume that every input is correct, we do not check type or bad value input.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2. Number 2.");
		System.out.println("Give us A the center of circle:");
		System.out.println("x1:");
		double x1 = scanner.nextDouble();
		System.out.println("x2:");
		double x2 = scanner.nextDouble();
		System.out.println("Then give us r the radius of circle:");
		System.out.println("r:");
		double r = scanner.nextDouble();
		System.out.println("Now give us B the first point of rectangle:");
		System.out.println("b1:");
		double b1 = scanner.nextDouble();
		System.out.println("b2:");
		double b2 = scanner.nextDouble();
		System.out.println("And give us C the second point of rectangle:");
		System.out.println("c1:");
		double c1 = scanner.nextDouble();
		System.out.println("c2:");
		double c2 = scanner.nextDouble();
		System.out.println("Finally give us the poor Point D");
		System.out.println("d1:");
		double d1 = scanner.nextDouble();
		System.out.println("d2:");
		double d2 = scanner.nextDouble();
		Circle c = new Circle(new Point(x1, x2), r);
		Rectangle rec = new Rectangle(new Point(b1, b2), new Point(c1, c2));
		Point pointD = new Point(d1, d2);
		if(Factory.checkRectangleIn(pointD, rec) && Factory.checkCircleIn(pointD, c)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

}
