package triang_oo;

import java.util.Scanner;
import entites.Triangle;

public class program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Digite os comprimentos dos três lados do primeiro triângulo:");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();
		double p1 = (x.a+x.b+x.c)/2;
		double area1 = Math.sqrt(p1*(p1-x.a)*(p1-x.b)*(p1-x.c));
		System.out.println("Digite os comprimentos dos três lados do segundo triângulo:");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();
		double p2 = (y.a+y.b+y.c)/2;
		double area2 = Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c));
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