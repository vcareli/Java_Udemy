package triang;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c;
		double x, y, z;
		System.out.println("Digite os comprimentos dos três lados do primeiro triângulo:");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		double p1 = (a+b+c)/2;
		double area1 = Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
		System.out.println("Digite os comprimentos dos três lados do segundo triângulo:");
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		z = scanner.nextDouble();
		double p2 = (x+y+z)/2;
		double area2 = Math.sqrt(p2*(p2-x)*(p2-y)*(p2-z));
		//IO.println("Triangle Area - Heron Fomule");
		System.out.printf("Triangle 1 Area: %.2f%n", area1);
		System.out.printf("Triangle 2 Area: %.2f%n", area2);
		IO.print("Larger Area: ");
		if (area1 > area2) {
			System.out.println("Triangle 1");
		} else {
			System.out.println("Triangle 2");
		}
		scanner.close();
	}
}