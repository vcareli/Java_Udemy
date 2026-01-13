import java.util.Locale;
import java.util.Scanner;

import entites.Rectangle;
import entites.rectangle;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Digite altura do retangulo: ");
		rectangle.haut = sc.nextDouble();
		System.out.println("Digite largura do retangulo: ");
		rectangle.larg = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		sc.close();
	}
}