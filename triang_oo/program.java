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
		System.out.println("Digite os comprimentos dos três lados do segundo triângulo:");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();
		double areaX = x.area();
		double areaY = y.area();
		System.out.printf("Triangle 1 Area: %.2f%n", areaX);
		System.out.printf("Triangle 2 Area: %.2f%n", areaY);
		IO.print("Larger Area: ");
		if (areaX > areaY) {
			System.out.println("Triangle 1");
		} else {
			System.out.println("Triangle 2");
		}
		scanner.close();
	}
}